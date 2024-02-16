package examen;

import java.util.Date;

public class Usuario {

    protected String nombre;
    protected String apellido;
    protected String clave;
    protected Date fecha;
    protected String sexo;
    protected String departamento;
    protected String numidentidad;

    public Usuario(String nombre, String apellido, String clave, Date fecha, String sexo, String departamento, String numidentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.fecha = fecha;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numidentidad = numidentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getClave() {
        return clave;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNumidentidad() {
        return numidentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNumidentidad(String numidentidad) {
        this.numidentidad = numidentidad;
    }

    @Override
    public String toString() {
        return "Usuario: \n" + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nClave: " + clave + "\nFecha: " + fecha + "\nSexo=" + sexo + "\nDepartamento: " + departamento + "\nNumero de identidad=" + numidentidad + "\n";
    }

}
