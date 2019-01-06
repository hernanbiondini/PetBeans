/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Administrador
 */
public class Propiedades {
    
  private String nombrePc="";
  private String procesor="";
  private String sistemaOperativo="";
  private String versionSO="";
   
   public void obtenerPropiedades(){
   
        nombrePc=System.getenv("COMPUTERNAME");              
        procesor=System.getenv("PROCESSOR_IDENTIFIER");       
        sistemaOperativo=System.getProperty("os.name");        
        versionSO=System.getProperty("os.version");       
        
   } 
    
   public String generarSerial(){
    String serialp="";
    serialp=nombrePc+sistemaOperativo+versionSO+procesor;
    
    serialp=serialp.toUpperCase();
    serialp=serialp.trim();
    serialp=serialp.replace('A', 'X');
    serialp=serialp.replace('O', '0');
    serialp=serialp.replace('E', 'G');
    serialp=serialp.replace('-', '9');
    serialp=serialp.replace(',', 'M');
    serialp=serialp.replace('.', 'Y');
    serialp=serialp.replace('U', 'Z');
    serialp=serialp.replace('I', 'R');
    serialp=serialp.replace('P', 'G');
    serialp=serialp.replace('C', '9');
    serialp=serialp.replace('8', 'M');
    serialp=serialp.replace('6', 'T');
    serialp=serialp.replace('4', 'Z');
    serialp=serialp.replace('W', 'E');
    serialp=serialp.replace('D', 'S');
    serialp=serialp.replace('O', 'R');
    serialp=serialp.replace('X', 'D');
    serialp=serialp.replace(' ', 'G');
    
    serialp=serialp.intern();
    serialp=serialp.substring(0, 25);
    
    String s1=serialp.substring(0, 5);
    String s2=serialp.substring(5, 10);
    String s3=serialp.substring(10, 15);
    String s4=serialp.substring(15, 20);
    String s5=serialp.substring(20, 25);
    
    serialp=s5+"-"+s4+"-"+s2+"-"+s1+"-"+s3;

    return serialp;
}



}