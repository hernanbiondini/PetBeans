package util;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.view.save.JRPdfSaveContributor.*;
import net.sf.jasperreports.view.JRViewer.*;
import net.sf.jasperreports.view.save.JRMultipleSheetsXlsSaveContributor.*;

public class EjecutarReporte implements Constantes {

        public String DRIVER=" ";
        public String RUTA=" ";
        public String USER=" ";
        public String PASSWORD=" ";
	public static Connection CONEXION;
        private Vernam ver = new Vernam();

    public EjecutarReporte() {
        this.conf();
    }
        
    public  void startReport(String rutaReporte, int id, int id2, String parametro3, String parametro4) {
        try{
            Class.forName(DRIVER);
            CONEXION = DriverManager.getConnection(RUTA,USER,PASSWORD);
            
            try {
                Map parameters = new HashMap();
                parameters.put("id", id);
                parameters.put("id2", id2);
                parameters.put("parametro3", parametro3);
                parameters.put("parametro4", parametro4);
                JasperReport report = JasperCompileManager.compileReport(rutaReporte);
                JasperPrint print = JasperFillManager.fillReport(report, parameters, CONEXION);
                JasperViewer visor=new JasperViewer(print, false);
                visor.setTitle("Reportes Petbeans");           
                visor.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }


    public void conf() {
    try{
      Properties p = new Properties();
      p.load(new FileInputStream("conf.ini"));
      DRIVER=ver.desencriptar(p.getProperty("Driver"),CLAVE);
      RUTA=ver.desencriptar(p.getProperty("Ruta"),CLAVE);
      USER=ver.desencriptar(p.getProperty("Usuario"),CLAVE);
      PASSWORD=ver.desencriptar(p.getProperty("Password"),CLAVE);
      }
    catch (Exception e) {
      System.out.println(e);
      }
    }

}
