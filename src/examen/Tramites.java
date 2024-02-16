package examen;

import java.util.Date;

public class Tramites {

    private String nombre;
    private String descripcion;
    private Date fechaenvio;
    private String numidentidad;

    public Tramites(String nombre, String descripcion, Date fechaenvio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaenvio = fechaenvio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaenvio() {
        return fechaenvio;
    }

    public String getNumidentidad() {
        return numidentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaenvio(Date fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public void setNumidentidad(String numidentidad) {
        this.numidentidad = numidentidad;
    }

    @Override
    public String toString() {
        return "Tramites: \n" + "\nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nFecha de envio: " + fechaenvio + "\nNumero de Identidad: " + numidentidad + "\n";
    }

}
