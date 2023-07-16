/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equalsyhash;

import java.util.Objects;

/**
 *
 * @author Alex
 */
public class Persona {
    private String apellido;
    private String nombre;
    protected int nroDocumento; //AL SER PROTECTED SOLO PUEDEN ACCEDER DE MANERA DIRECTA LA CLASE QUE LO HEREDA

    public Persona(String apellido, int nroDocumento){
        this.apellido = apellido;
        this.nombre = "NN";
        this.nroDocumento = nroDocumento;
    }
    
    public Persona(){
        
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
   
    @Override // ESTE METODO LO HEREDA DE LA CLASE OBJECT POR ESO ES NECESARIO SOBRE-ESCRIBIRLO. DE ESTA MANERA EN EL PRINCIPAL MUESTRA LOS DATOS
    public String toString(){
        return apellido + " " + nombre + " " + nroDocumento;
    }

    
    //AL INSTERTAR Y SOBREESCRIBIR CODIGO EQUALS Y HASHCODE YA NO COMPARA LA UBICACION DEL OBJETO SINO LOS NOMBRES
   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.apellido);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.nroDocumento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.nroDocumento != other.nroDocumento) { //COMPARA LOS DOCUMENTOS, DE ESTA MANERA SI SON IGUALES DA TRUE
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
   
    
}
