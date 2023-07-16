/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carchivos;

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
        int numeros[] = new int[] {1,37,17};
        int resultado = 0, x = 16;
        float resultadoDos = 0;
        for (int i = 0; i < numeros.length; i++){
            //if(numeros[i] > 16) //ACA SOLO MUESTRA LOS NUMEROS MAYORES A 16
                resultado += numeros[i]; //numeros[i] SUMA TODOS LOS NUMEROS. SI SOLO PONGO i DARIA 3
        }
        resultadoDos = (float)resultado / numeros.length; //CON ESTO MUESTRA EL PROMEDIO DE LA SUMA
        System.out.println(resultadoDos); //PARA QUE ME DE UN FLOAT UNO DE LA DIVISION TIENE QUE SER FLOAT. SE LE AGREGA(FLOAT)A RESULTADO
        
        System.out.println("----EN FORMA DE FUNCION: ----");
        
        int numeross[] = new int[] {1,37,17};
        int numerossBis[] = new int[] {5,7,2};
        float resultadoss = sumatoria(numeross);
        int resultadossBis = sumatoria(numerossBis);
        
        resultadoss = resultadoss / numeross.length; 
        System.out.println("Promedio: " + resultadoss);
        System.out.println("Suma: " + resultadossBis);        
        }
        
    //ACA ARRANCA LA FUNCION, QUE LUEGO LO APLICA ARRIBA
        private static int sumatoria(int num[]){
            int suma = 0;
            for (int i = 0; i < num.length; i++){
                suma += num[i];
            }            
            return suma;                        
        }    
              
}
    

