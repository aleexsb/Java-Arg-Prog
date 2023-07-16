/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barrays;

/**
 *
 * @author Alex
 */
public class Cadenas {
    public static void main(String[] args) {  
        String nombre = "\\Alex"; //IMPRIME UNA BARRA ANTES DEL NOMBRE
        String apellido = "\"Bakir\""; //CON LA BARRA SE PUEDE ESCRIBIR LAS COMILLAS
        
        String resultado1 = nombre + " "+ apellido;
        System.out.println(resultado1);
        String resultado2 = resultado1.toLowerCase(); //CONVIERTE MINUSCULA
        System.out.println(resultado2);
        
        String resultado3 = resultado1.toUpperCase();
        System.out.println(resultado3);
        
        System.out.println("Cantidad de caracteres: " + nombre.length());
        System.out.println(apellido.toUpperCase().charAt(2)); //PRIMERO SE CONVIERTE A MAYUSCULA PORQUE ES UN CARACTER
        
        System.out.println(resultado1.equals(resultado2)); // COMPARA AL SER MAYUS NO ES IGUAL.
        System.out.println(resultado3.contains("BA")); //AL ESTAR EN MAYUS DA TRUE.
        System.out.println(resultado1.startsWith("Ale"));
        System.out.println(resultado3.endsWith("rabona"));
        
        System.out.println(resultado3.replace("ALEX", "STEPHAN").replace("BAKIR", "CRACK"));
        
        System.out.println("----");
        
        String resultadoCadena[] = resultado3.split(" ");
        for(String cadena : resultadoCadena){
            System.out.println(cadena.trim()); //TRIM NO DEJA ESPACIOS
            System.out.println(cadena.trim().length());
        }
        
    }
    
}
