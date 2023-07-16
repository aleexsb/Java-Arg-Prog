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
public class Materia {

    private String nombre;
    private List<Materia> correlativas = new ArrayList<Materia>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedeCursar(Alumno alumno) {
        return true;
    }

    public void asignarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean PuedeCursar(Alumno alumno) { //VIENE DE INSCRIPCION, RECIBE UN ALUMNO
        //1. TIENE QUE BUSCAR SI LA MATERIA QUE LLAMA AL METODO TIENE CORRELATIVAS
        //2. SI TIENE CORRELATIVAS TIENE QUE VERIFICAR SI EL ALUMNO LA TIENE APROBADA
        //3. SI NO TIENE CORRELATIVAS TIENE QUE RETORNAR TRUE
        //this.correlativas
        //alumno.getMateriasAprobadas();
        return true;
    }

}
