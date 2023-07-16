/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mtpintermedio;

import java.time.LocalDate;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        Materia m1 = new Materia("Programacion I");
        Materia m2 = new Materia("Programacion II");
        Materia m3 = new Materia("Programacion III");

        m2.asignarCorrelativa(m3);
        m3.asignarCorrelativa(m1);
        m3.asignarCorrelativa(m2);

        ArrayList<Materia> planEstudio = new ArrayList<>();
        planEstudio.add(m1);
        planEstudio.add(m2);
        planEstudio.add(m3);

        Alumno alumno1 = new Alumno("Teresa Romano", "123");
        Alumno alumno2 = new Alumno("Pablo Perez", "547");
        alumno2.agregarMateriaAprobada(m1);
        //alumno2.agregarMateriaAprobada(planEstudio.get(0));

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

        Inscripcion insc1 = new Inscripcion(alumno1, m2); //ESTO TIENE INSC1, ESTE ALUMNO Y ESTA MATERIA 
        //Inscripcion insc1 = new Inscripcion(alumnos.get(0), planEstudio.get(1)); // ASI SERIA DE LA MANERA CORRECTA
        Inscripcion insc2 = new Inscripcion(alumno2, m2);

        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.add(insc1); //SE ENCUENTA EN LA POSICION 1 DEL ARRAYLIST
        inscripciones.add(insc2);

        //PROCESAR INSCRIPCION
        for (Inscripcion inscProc : inscripciones) { //LLAMA AL METODO APROBADA. AL ELEMENTO 1 DE ESTE ARRAYLIST 
            if (inscProc.aprobada()) //METODO APROBADA DENTRO DE INSCRIPCION
            {
                System.out.println(inscProc.getAlumno().getLegajo() + "\t" + inscProc.getAlumno().getNombre() + "\t" + inscProc.getMateria().getNombre() + "\t" + "Aprobada");
            } else {
                System.out.println(inscProc.getAlumno().getLegajo() + "\t" + inscProc.getAlumno().getNombre() + "\t" + inscProc.getMateria().getNombre() + "\t" + "Rechazada");
            }
        }

//        for(Inscripcion inscripcion : inscripciones){
//            if(inscripciones.aprobada()){
//                System.out.println(inscripcion.getAlumno().getNombre());
//            }
//        }
        String fileName = "Inscripciones.csv"; // SE CREA EN LA RAIZ DENTRO DEL PAQUETE
        ArrayList<String[]> data = new ArrayList<>();
        //data.add({"123","Pedro","Programacion I", "03-04-1990"}); ABAJO ES COMO SI QUISIERA DECIR ESTO.
        data.add(new String[]{insc1.getAlumno().getLegajo(), insc1.getAlumno().getNombre(), insc1.getMateria().getNombre(), insc1.getFecha().toString()});
        data.add(new String[]{insc2.getAlumno().getLegajo(), insc2.getAlumno().getNombre(), insc2.getMateria().getNombre(), insc2.getFecha().toString()});
        try {
            FileWriter writer = new FileWriter(fileName);//fileName HCE REFERENCIA A Inscripciones.csv

            for (String[] rowData : data) { //GUARDAMOS EN STRING EN ROW DATA, INDICANDO QUE VAMOS A TENER UNA FILA
                for (String cellData : rowData) { //AHORA RECORRO LOS QUE ESTA FUARDADO DENTRO DE ROW DATA
                    writer.append(cellData);
                    writer.append("|");
                    //EL ARCHIVO QUEDARIA rowData={"123","Pedro","PROGRAMACION III", "03-04/1957"
                }
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Datos escritos en el archivo " + fileName);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + fileName);
            e.printStackTrace();
        }
    }
}
