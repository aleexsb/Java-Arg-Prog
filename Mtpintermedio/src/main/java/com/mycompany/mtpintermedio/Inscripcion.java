/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mtpintermedio;

import java.time.LocalDate;

/**
 *
 * @author Alex
 */
public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDate.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean aprobada() { // VA A puedeCursar dentro de MATERIA Y DEVUELVE TRUE OR FALSE
//        boolean resultado = false;
//        resultado = materia.PuedeCursar(alumno); PUEDE CURSAR LLAMA AL ALUMNO, PUEDE CURSAR SE ENCUENTRA EN MATERIA
//        return resultado;
        return materia.puedeCursar(alumno);
    }
}
