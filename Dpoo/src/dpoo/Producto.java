/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpoo;

import java.time.LocalDate;

/**
 *
 * @author Alex
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private int pesoKg;
    private double precio;
    
    private static final double minPrecio = 0.1;
    
    public Producto(String newNombre){
        this.nombre = newNombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Producto() { //OTRA MANERA DE CREAR UN CONTRUCTOR, CON VALORES NULOS
        
   }

    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getPesoKg() {
        return this.pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrar(){ //SI PONGO private void NO ME PERMITE EJECUTARLO DESDE EL PRINCIPAL, SOLO DESDE LA CLASE
        System.out.println(nombre);
        System.out.println(descripcion);
        System.out.println(fechaAlta);
    }
    
    
    
}
