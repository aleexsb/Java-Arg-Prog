/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtpintermedio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas = new ArrayList<>();
    
    public Alumno(String nombre, String legajo){
        this.nombre = nombre;
        this.legajo = legajo;        
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    
    public void agregarMateriaAprobada(Materia materia){
        materiasAprobadas.add(materia);
    }
    
}
