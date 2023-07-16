/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jprogramacionpoo;

/**
 *
 * @author Teresa
 */
public class DescuentoPorcentaje extends Descuento{
    private float porcentaje;

    @Override
    public float descuento(float base) {
        return  base * porcentaje;
    }
    
}
