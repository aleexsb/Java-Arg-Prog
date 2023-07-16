/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carchivos;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ejScanner {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese numeros separados x un espacio: ");
        String numeros = scn.nextLine();
        int resultado = 0;
        for (String numeroStr : numeros.split(" ")) {
            int numero = Integer.parseInt(numeroStr); //ASI CONVIERTE UN STRING EN UN ENTERO USANDO Ineger.parseInt
            
            resultado += numero;
        }
        System.out.println(resultado); //DEVUELVE LA SUMA DE LOS NUMEROS INGRESADOS                              
        
    }
}