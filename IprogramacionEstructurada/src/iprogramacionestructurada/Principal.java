/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iprogramacionestructurada;

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
        int cantidad []={3,2,5};
        float precios [] = {300,150,200};
        String tipoDescuento = "%";
        float porcentaje = 0.25f;
        float fijo = 100f;
        
        float resultado = 0;
        resultado = calcularPrecio(precios,cantidad,tipoDescuento,porcentaje, fijo);
        System.out.println("El precio total es: " + resultado);
              
    }
    public static float calcularPrecio(float precios[], int cantidad[], String tipoDescuento, float porcentaje, float fijo){
        float base = 0;
        for(int i = 0; i < precios.length; i++){
            base +=precios[i] * cantidad[i];
        }
        if (tipoDescuento == "%")
            return base - base * porcentaje;
        if(tipoDescuento == "fijo")
            return base-fijo;
        else{
            return base;
        }           
    }    
}
