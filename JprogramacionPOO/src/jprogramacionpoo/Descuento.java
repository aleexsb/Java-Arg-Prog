/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jprogramacionpoo;

import java.time.LocalDate;

/**
 *
 * @author Teresa
 */
public abstract class Descuento {
    private LocalDate comienzo;
    private LocalDate fin;
    
    public abstract float descuento(float base);
    
}
