/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kcolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        int vector[] = {1, 2, 3};

//        CON ESTE CODIGO SE PUEDE IR AGREGANDO LOS NUMEROS A LA LISTA
//        ArrayList<Integer> listaEnteros = new ArrayList<>();
//        listaEnteros.add(3);
//        listaEnteros.add(4);
//        listaEnteros.add(10);
//        listaEnteros.add(8);
//        
//        for (int i=0; i<listaEnteros.size();i++) { SIZE DETERMINA CUANTOS ELEMENTOS TIENE EL ARRAYLIST. ES COMO UN LENGTH
//            System.out.println("Posicion " + i +": "+listaEnteros.get(i));
//        }
        Producto prod1 = new Producto(100, "cuaderno", 250);
        Producto prod2 = new Producto(403, "voligama", 750);
        Producto prod3 = new Producto(248, "television", 4550);
        Producto prod4 = new Producto(248, "television", 4550);
        Producto prod5 = new Producto(250, "Television", 4550); //TIENE MAYUSCULA. SI NO TIENE ComparetoIgnoreCase en PRODUCTO VA A IR PRIMERO SIEMPRE.

        ArrayList<Producto> listaProductos = new ArrayList<>();

        if (!listaProductos.contains(prod1)) //contains LLAMA AL EQUALS
        {
            listaProductos.add(prod1);
        }
        if (!listaProductos.contains(prod2)) {
            listaProductos.add(prod2);
        }
        if (!listaProductos.contains(prod3)) {
            listaProductos.add(prod3);
        }
        if (!listaProductos.contains(prod3)) {
            listaProductos.add(1, prod3); //ME AGREGA UN PRODUCTO EN UNA POSICION
        }
        if (!listaProductos.contains(prod4)) {
            listaProductos.add(prod4); //SOBREESCRIBIENDO CON EL EQUALS EN LA CLASE PRODUCTO, YA NO AGREGA AL PRODUCTO REPETIDO
        }
        if (!listaProductos.contains(prod5)) {
            listaProductos.add(prod5);
        }

        //listaProductos.remove(1); //REMUEVE EL ELEMENTO AGREGADO EN LA POSICION INDICADA
        Collections.sort(listaProductos); //SORT SE ENCARGA DE ORDENAR LA LISTA DE PRODUCTOS, LLAMA AL METODO EN PRODUCTO
        double precioFinal = 0;
        for (Producto p : listaProductos) {
            precioFinal += p.getPrecio();
            System.out.println(p);
        }
        System.out.println("Precio Total: " + precioFinal);
        
        
        //USANDO UN ITERADOR - RECORRE LA LISTA
        double precioFinal_2 = 0;
        Iterator<Producto> iteradorProducto = listaProductos.iterator();
        while (iteradorProducto.hasNext()){
            Producto p = iteradorProducto.next();
            precioFinal_2 += p.getPrecio();
            System.out.println(p); //ACA MUESTRO LOS PRODUCTOS           
        }
        System.out.println("Iterador Precio final 2: " + precioFinal_2);
        
        
        //USANDO FUNCIONES DE ALTO ORDEN  - EXPRESIONES LAMBDA- RECORRE LA LISTA
        //USANDO ESTA SITUACION NO PUEDO MOSTRAR ELEMENTO X ELEMENTO. SOLO EL PRECIO FINAL.
        double precioFinal_3 = 0;
        precioFinal_3 = listaProductos.stream().mapToDouble(p -> p.getPrecio()).sum();
        System.out.println("Alto Orden Resultado Final: " + precioFinal_2);
        
    }
    
           
    

}
