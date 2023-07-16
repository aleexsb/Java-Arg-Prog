/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barrays;

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
        int numeros[] = new int [10];
        char letras[] = {'a','b','c'};
        
        numeros[0] = 5;
        numeros[1]= 8;
        numeros[2] = 9;
        numeros[6] = 4;
        
                
        int resultado = numeros[1]/2;
        System.out.println("El resultado es: " + resultado);
        
        System.out.println("-----");
         
        //MUESTRA LOS IMPARES
        for (int indice = 0; indice < numeros.length;indice++){
            if (numeros[indice]%2 !=0) //SI SACO LA PALABRA NUMEROS MUESTRA LOS INDICES IMPARES
                System.out.println("numeros["+indice+"] = "+numeros[indice]);
        }
        
        System.out.println("-----");

        
        int contador = 0;
        for(char letra : letras) {
            if (contador % 2 == 0) 
                System.out.println(letra);
                contador++; // MUSTRA LOS INCDICES PARES
        }
        
        System.out.println("-----");

                
        int indice = 0;
        for (int n : numeros){
            if (n % 2 != 0){
                System.out.println("indice: " + indice);
                System.out.println("Contenido: " + n);
            }
            indice++; //SI EJECUTAS MAS DE UNA LINEA DENTRO DEL IF, EL CONTADOR VA POR FUERA
        }
        
    }
   
    
}
