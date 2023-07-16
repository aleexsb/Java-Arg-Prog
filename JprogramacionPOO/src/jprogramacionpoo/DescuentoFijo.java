/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jprogramacionpoo;

/**
 *
 * @author Teresa
 */
public class DescuentoFijo extends Descuento{
    private float monto;
    
    public void setMonto(float monto){
        this.monto = monto;
    }

    @Override
    public float descuento(float base) {
        return  monto;
    }
}
