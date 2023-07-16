/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import equalsyhash.Persona; //DE ESTA MANERA REUTILIZO CODIGO, IMPORTANDO LA CLASE PERSONA DE OTRA CARPETA

/**
 *
 * @author Alex
 */
public class Alumno extends Persona {
    private int libreta;
    
    public Alumno(int libreta, String apellido, int nroDocumento){
        super(apellido, nroDocumento);
        this.libreta = libreta;
    }

    
    public int getLibreta() {
        return libreta;
    }

    public void setLibreta(int libreta) {
        this.libreta = libreta;
    } 
 
    public void mostrar(){
        System.out.println(getApellido());
    }
    
    @Override
    public String toString(){
        return "Libreta: " + libreta + " " + super.toString() + nroDocumento; //nroDocumento AL SER PROTECTED LO PUEDO LLAMAR SIN METODO, PORQUE ALUMNO ES HIJO DE PERSONA
    }
    
    
}
