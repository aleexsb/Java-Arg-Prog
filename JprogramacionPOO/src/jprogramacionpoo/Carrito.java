/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jprogramacionpoo;

/**
 *
 * @author Teresa
 */
public class Carrito {
    private ItemCarrito items[];
    private String fecha;

    public Carrito(ItemCarrito[] items, String fecha) {
        this.items = items;
        this.fecha = fecha;
    }
    
    
    public float precio(Descuento Desc){
       float base = 0;
       for(int i=0; i < items.length ; i++){
           base = base + items[i].precio();
       }
       return  base - Desc.descuento(base);
    }
}
