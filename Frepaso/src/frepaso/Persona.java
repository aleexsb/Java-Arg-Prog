/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frepaso;

import java.time.LocalDate;

/**
 *
 * @author Alex
 */
public class Persona {
    private String nombre;
    private String apellido;
    private float estatura;
    private LocalDate fechaNacimiento;
    
    public Persona(String nombre, String apellido, LocalDate fechaNacimiento){ //ASI SE CREA UN CONSTRUCTOR
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona() { //OTRA MANERA DE CREAR UN CONTRUCTOR VACIO
    
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrar() {
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + getNombre());//USAR GET ES MEJOR 
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
    
    public int edad(){
        return LocalDate.now().getYear() - fechaNacimiento.getYear(); //AL AÑO DE HOY LE RESTA LA FECHA DE NACIMIENTO SETEADO
    }
       
}
