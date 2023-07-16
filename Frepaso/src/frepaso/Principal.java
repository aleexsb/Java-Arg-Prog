/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frepaso;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Alex
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona();
        per.setApellido("Lorca");
        per.setFechaNacimiento(LocalDate.of(1980, Month.MARCH, 15));
//        System.out.println("Apellido; " + per.getApellido());
//        System.out.println("Fecha nacimiento: " + per.getFechaNacimiento());
        per.mostrar(); //MOSTAR() SE LLAMA DESDE CLASE PERSONA
        System.out.println("edad: " + per.edad()); //CALCULA LA EDAD METODO EN CLASE PERSONA
        
        System.out.println("----");
        
        Persona per2 = new Persona("Juan", "Perez", LocalDate.now());
//        System.out.println("Fecha de Nacimiento: " + per2.getFechaNacimiento());
        per2.mostrar();
    }
    
}
