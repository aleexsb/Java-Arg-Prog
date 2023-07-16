/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import equalsyhash.Persona; //ES NECESARIO IMPORTAR PERSONA.

/**
 *
 * @author Alex
 */
public class Principal {
    public static void main(String[] args) { //SI ESCRIBIS psvm LUEGO TAB, ESCRIBE LA LINEA COMPLETA
        Persona per = new Alumno(1000, "Ayala", 123457);
        System.out.println(per); //PRIMERO BUSCA EL toString EN ALUMNO, SI NO HAY, BUSCA EN SU PADRE PERSONA. EN ALUMNO, SE PUEDE CONCATENAR EL toString DEL PADRE
             
    }
}
