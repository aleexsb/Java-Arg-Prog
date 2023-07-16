/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aejercicios;

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
        System.out.println("Ejercicio 1.a - Mostrar del 5 al 14");
        
        int valorInicial = 5;
        int valorFinal = 14;
        while (valorInicial <= valorFinal) {
            System.out.println(valorInicial);
            valorInicial++;
        }
        
        System.out.println("Ejercicio 1.b - Pares");
        
        int valorInicial2 = 5;
        int valorFinal2 = 14;
        while (valorInicial2 <= valorFinal) {
            if (valorInicial2 % 2 == 0) {
                System.out.println(valorInicial2);
            }
            valorInicial2++;
        }
        
        System.out.println("Ejercicio 1.c");
        
        int valorInicial3 = 5;
        int valorFinal3 = 14;
        boolean mostrarPar = true;
        while (valorInicial3 <=valorFinal3){
            if(mostrarPar){
            if (valorInicial3 %2==0){
                System.out.println(valorInicial3);
            }
            }
            valorInicial3++;
        }
        
        System.out.println("Ejercicio 1.d");

    }

}