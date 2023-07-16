/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kcolecciones;

/**
 *
 * @author Alex
 */
public class Producto implements Comparable<Producto> { //PARA ORDENAR SE PUEDE IMPLEMENTAR UNA INTERFAZ COMPARABLE, ASI ORDENA OBJETOS DE LA ARRAYLIST
    private int codigo;
    private String nombre;
    private double precio;
    
    public Producto(int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return codigo + "\t " + nombre + "\t " + precio;
    }

    
    //CON ESTE CODIGO, LOGRO QUE NO AGREGUE UN PRODUCTO IGUAL AL OTRO PORQUE EL CODIGO ES EL MISMO. SI NO ESTA ESTE CODIGO, EL PRODUCTO SE AGREGA PORQUE COMPARA LA UBICACION DE MEMORIA
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    
    @Override
    public int compareTo(Producto o) { //METODO QUE GENERA LA INTEFAZ COMPARABLE
//        int resultado = 0;
//        if(this.codigo < o.codigo)
//            resultado = -1;
//        if(this.codigo> o.codigo)
//            resultado = 1;
//        return resultado;
            return this.nombre.compareToIgnoreCase(o.nombre); //SIRVE PARA ORDENAR STRING/FECHA. SINO ES COMO EL METODO DE ARRIBA.
        //SI QUIERO ORDENARLO POR PRECIO. CAMBIO LAS PALABRAS CODIGOS X PRECIO.-
    }
    
    
    
    
}
