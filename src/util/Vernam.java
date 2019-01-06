package util;

import java.util.Enumeration;
import java.util.Vector;

public class Vernam {
    //nuestro ABCDARIO

    private String abcdario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzáéíóú 1234567890@.,;:-+*/$#¿?!¡=()[]{}";

    public Vernam() {
    }

    public String encriptar(String texto, String clave) {
        String t = "";
        int a, b;
        char c;
        int i = 0;
        /*
         * Se transforma las cadenas de texto en vectores
         */
        Vector vtexto = to_vector(texto);
        Vector vclave = to_vector(clave);
        //se recorre uno a uno los elementos del vecto "texto", y junto al vector "clave" se realizan las
        //operaciones para encriptar/desencritar el mensaje
        Enumeration e = vtexto.elements();
        while (e.hasMoreElements()) {
            //se obtiene la posicion de cada caracter del mensaje respecto a nuestro abcdario
            char caracter = e.nextElement().toString().charAt(0);
            a = abcdario.indexOf(caracter);
            //se hace lo mismo para la "clave"
            b = abcdario.indexOf(vclave.get(i).toString().charAt(0));
            //esto encripta el caracter de acuerdo al cifrado de Vernam
            c = abcdario.charAt((a + b) % abcdario.length());
            // muestra con detalle el proceso de encriptado
            //System.out.println(caracter+"[" + a + "] + " + vclave.get(i) + "[" + b + "] MOD " + abcdario.length() + " = " + c + "[" + ((a+b)%abcdario.length())+"]");
            //se concatena el resultado
            t = t + c;
            i++;
            if (i == vclave.size()) {
                i = 0;
            }
        }
        return t;
    }

    public String desencriptar(String texto, String clave) {
        String t = "";
        int a, b;
        char c;
        int i = 0;
        Vector vtexto = to_vector(texto);
        Vector vclave = to_vector(clave);
        Enumeration e = vtexto.elements();
        while (e.hasMoreElements()) {
            a = abcdario.indexOf(e.nextElement().toString().charAt(0));
            b = abcdario.indexOf(vclave.get(i).toString().charAt(0));
            c = abcdario.charAt((abcdario.length() + a - b) % abcdario.length());
            t = t + c;
            i++;
            if (i == vclave.size()) {
                i = 0;
            }
        }
        return t;
    }

    /*
     * metodo que transforma una cadena de texto a un vector
     */
    private Vector to_vector(String texto) {
        Vector v = new Vector(10, 2);
        //convertimos el texto en un array
        char[] array = texto.toCharArray();
        //pasamos del array al vector
        for (int j = 0; j < array.length; j++) {
            v.addElement(array[j]);
        }
        return v;
    }
}
