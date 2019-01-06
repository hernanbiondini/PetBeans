package util;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class BackUp {

    private int BUFFER = 10485760;
    //para guardar en memmoria
    private StringBuffer temp = null;
    //para guardar el archivo SQL
    private FileWriter fichero = null;
    private PrintWriter pw = null;

    public boolean CrearBackupOriginal(String host, String port, String user, String password, String db, String file_backup, String Pathmysqldump) {
        boolean ok = false;
        try {
            System.out.println(host);
            System.out.println(port);
            System.out.println(user);
            System.out.println(password);
            System.out.println(db);
            System.out.println(file_backup);
            System.out.println(Pathmysqldump);

            //file_backup="C:/backup.sql";
            //sentencia para crear el BackUp
            Process run = Runtime.getRuntime().exec(
                    //"C:/Program Files/MySQL/MySQL Server 5.6/bin/"+    
                    Pathmysqldump
                    + "mysqldump --host=" + host + " --port=" + port
                    + " --user=" + user + " --password=" + password
                    + " --compact --complete-insert --extended-insert --skip-quote-names"
                    + " --skip-comments --skip-triggers " + db);
            //se guarda en memoria el backup
            InputStream in = run.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            temp = new StringBuffer();
            int count;
            char[] cbuf = new char[BUFFER];
            while ((count = br.read(cbuf, 0, BUFFER)) != -1) {
                temp.append(cbuf, 0, count);
            }
            br.close();
            in.close();
            /* se crea y escribe el archivo SQL */
            fichero = new FileWriter(file_backup);
            pw = new PrintWriter(fichero);
            pw.println(temp.toString());
            ok = true;
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Backup realizado exitosamente en: " + file_backup);

        return ok;
    }

    public void CrearBackup(String host, String port, String user, String password, String db, String file_backup, String Pathmysqldump) {
        try {
//            System.out.println(host);
//            System.out.println(port);
//            System.out.println(user);
//            System.out.println(password);
//            System.out.println(db);
//            System.out.println(file_backup);
//            System.out.println(Pathmysqldump);
            
            Process run = Runtime.getRuntime().exec(Pathmysqldump + " -u " + user + " -p" + password + " " + db);

            InputStream is = run.getInputStream();
            FileOutputStream fos = new FileOutputStream(file_backup);
            byte[] buffer = new byte[1000];

            int leido = is.read(buffer);
            while (leido > 0) {
                fos.write(buffer, 0, leido);
                leido = is.read(buffer);
            }

            fos.close();
            JOptionPane.showMessageDialog(null, "Backup realizado exitosamente en: " + file_backup);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al realizar el Backup: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void Backup() {
        try {
            System.out.println("backup");
            Process p = Runtime.getRuntime().exec("C:/Program Files/MySQL/MySQL Server 5.6/bin/mysqldump -u root -proot veterinaria");

            InputStream is = p.getInputStream();
            FileOutputStream fos = new FileOutputStream("C:/Users/herna/Desktop/backup_pruebas.sql");
            byte[] buffer = new byte[1000];

            int leido = is.read(buffer);
            while (leido > 0) {
                fos.write(buffer, 0, leido);
                leido = is.read(buffer);
            }

            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
