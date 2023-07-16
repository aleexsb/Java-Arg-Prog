/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equalsyhash;

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
        per.setApellido("Alvarez");
        System.out.println("Objeto per: " + per); //AUNQUE NO LO VEAMOS, PER LLAMA DE MANERA IMPLICITA A toString
        
        Persona per1 = new Persona("Gomez", 45678878);
        System.out.println("Objeto per1: " + per1);
        
        Persona per2 = new Persona("Gomez", 45678878);
        System.out.println("Objeto per1: " + per2);
        
        System.out.println("Resultado de Comparar Objetos: " + per1.equals(per2)); //DA FALSE PORQUE EL IDENTFICADOR DEL OBJETO ES OTRO. COMPARA LA UBICACION
        //COMO SOBREESCRIBI EL EQUALS EN PERSONA, AHORA COMPARA LOS DOCUMENTOS Y ATRIBUTOS. POR ESO DA TRUE. SINO, DARIA FALSE
        
        
        
    }
    
}
