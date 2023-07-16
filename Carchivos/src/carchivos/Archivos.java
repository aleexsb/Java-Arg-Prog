/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Alex
 */
public class Archivos {

    public static void main(String[] args) {
        String archivo = "C:\\Users\\Alex\\Desktop\\ArgentinaPrograma\\Carchivos\\alexito.txt";
        
        try {
            Files.writeString(Paths.get(archivo), "hola\n que tal?\n");

        } catch (IOException ex) {
            System.out.println("Error al escribir un Archivo");
        }

        //TAMBIEN SE PUEDE CREAR UNA FUNCION PARA LEER Y ESCRIBIR
        
        leerArchivo(archivo);
    }

    private static void leerArchivo(String archivo) {
        try {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer un Archivo");
        }

    }

}