/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dpoo;

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
        Producto prod1 = new Producto("Atun");
        prod1.setDescripcion("Al aceite");
        System.out.println("Direccion de Memoria: " + prod1); //ACA MUESTRA LA DIRECCION DE MEMORIA, LA UBICACION
        System.out.println("Nombre del Producto: " + prod1.getNombre());

        System.out.println("---");

        Producto prod2 = new Producto("Arroz");
        prod2.mostrar();

        System.out.println("---");

        Producto prod3 = new Producto("Gaseosa", "Coca-Cola");
        prod3.mostrar();
        
        System.out.println("---");
        
        Producto prod4 = new Producto();
        prod4.mostrar();

    }

}
