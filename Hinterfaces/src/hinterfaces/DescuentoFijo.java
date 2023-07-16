/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinterfaces;

/**
 *
 * @author Alex
 */
public class DescuentoFijo implements Descuento {

    @Override
    public float calcularPrecio(float valorInicial) {
        return valorInicial - VALOR;
    }
    
}
