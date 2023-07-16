/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jprogramacionpoo;

/**
 *
 * @author Teresa
 */
public class Principal {
    public static void main(String[] args) {
        
        DescuentoFijo desc = new DescuentoFijo();
           desc.setMonto(100f);
           
        Producto prod1= new Producto("Gaseosa", 300);
        Producto prod2= new Producto("Azucar", 100f);
        
        ItemCarrito itemsCar1 = new ItemCarrito(prod1, 3);
        ItemCarrito itemsCar2 = new ItemCarrito(prod2, 2);
        
        ItemCarrito itemCar []= {itemsCar1, itemsCar2};
        
        
        Carrito carrito = new Carrito(itemCar, "27/03/2023");
        
        System.out.println("Pagar el importe de: " + carrito.precio(desc));
        
        
    }
   
}
