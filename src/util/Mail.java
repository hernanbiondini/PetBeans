package util;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail implements Constantes {

    private String protocolo = "";
    private String mailsmtphost = "";
    private String mailsmtpstarttlsenable = "";
    private String mailsmtpport = "";
    private String mailsmtpuser = "";
    private String mailsmtpauth = "";
    private String InternetAddress = "";
    private String GmailAcount = "";
    private String gmailpass = "";
    private String messagesubject = "";
    private String contenidomens = "";
    private Session session;
    private Message message;
    private Vernam ver = new Vernam();

    public Mail() {
        conf();
    }

    public void conf() {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("conf.ini"));
            protocolo = ver.desencriptar(p.getProperty("protocolo"), CLAVE);
            mailsmtphost = ver.desencriptar(p.getProperty("mailsmtphost"), CLAVE);
            mailsmtpstarttlsenable = ver.desencriptar(p.getProperty("mailsmtpstarttlsenable"), CLAVE);
            mailsmtpport = ver.desencriptar(p.getProperty("mailsmtpport"), CLAVE);
            mailsmtpauth = ver.desencriptar(p.getProperty("mailsmtpauth"), CLAVE);
            //--------------------------------------------------------------------------
            //mailsmtpuser = ver.desencriptar(p.getProperty("mailsmtpuser"),CLAVE);
            mailsmtpuser = ver.desencriptar(p.getProperty("GmailAcount"), CLAVE);//Sesion
            InternetAddress = ver.desencriptar(p.getProperty("InternetAddress"), CLAVE);//From
            GmailAcount = ver.desencriptar(p.getProperty("GmailAcount"), CLAVE);//Enviar
            //--------------------------------------------------------------------------
            gmailpass = ver.desencriptar(p.getProperty("gmailpass"), CLAVE);
            messagesubject = ver.desencriptar(p.getProperty("messagesubject"), CLAVE);
            contenidomens = ver.desencriptar(p.getProperty("contenidomens"), CLAVE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void obtenerSesion() throws AddressException, MessagingException {
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", mailsmtphost);
        props.setProperty("mail.smtp.starttls.enable", mailsmtpstarttlsenable);
        props.setProperty("mail.smtp.port", mailsmtpport);
        props.setProperty("mail.smtp.user", mailsmtpuser);
        props.setProperty("mail.smtp.auth", mailsmtpauth);
        // Preparamos la sesion
        session = Session.getDefaultInstance(props);
        session.setDebug(false);
        System.out.println(mailsmtphost);
        System.out.println(mailsmtpport);
    }

    public void crearMensaje() throws AddressException, MessagingException {
        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(InternetAddress));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("hernanbiondini@gmail.com"));
        message.setSubject(messagesubject);
        message.setText(contenidomens);
    }

    public void crearMensaje(String direccion, String asunto, String texto) throws AddressException, MessagingException {
        message = new MimeMessage(session);
        //message.setFrom(new InternetAddress(InternetAddress, "Alejandro"));
        String[] direcciones = direccion.split(";");
        Address[] dir = null;
        System.out.println(direcciones.length);
        for (int i = 0; i < direcciones.length; i++) {
            System.out.println(direcciones[i]);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(direcciones[i]));
        }
        //message.addRecipient(Message.RecipientType.TO,new InternetAddress(direccion));
        message.setSubject(asunto);
        message.setText(texto);
    }

    public void enviar() throws MessagingException {
        // Lo enviamos.
        Transport t = session.getTransport(protocolo);
        t.connect(GmailAcount, gmailpass);
        t.sendMessage(message, message.getAllRecipients());
        // Cierre.
        t.close();
        JOptionPane.showMessageDialog(null, "Mail enviado", "Envio", JOptionPane.ERROR_MESSAGE);
    }

    public boolean hayConexion() {
        //false = no hay conexión
        //true = hay conexión
        boolean estado = false;
        try {
            URL ruta = new URL("http://www.google.com");
            URLConnection rutaC = ruta.openConnection();
            rutaC.connect();
            estado = true;
        } catch (Exception e) {

            estado = false;
        } finally {
            System.out.println("Conexión: " + estado);
        }
        return estado;
    }
}
