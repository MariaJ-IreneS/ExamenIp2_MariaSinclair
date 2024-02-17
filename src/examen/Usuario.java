package examen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Usuario {
    
    protected String nombre;
    protected String apellido;
    protected String clave;
    protected Date fecha;
    protected String sexo;
    protected String departamento;
    protected String numidentidad;
    
    public Usuario(String nombre, String apellido, String clave, Date fecha, String sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.fecha = fecha;
        this.sexo = sexo;
        this.departamento = departamento;
        setNumidentidad();
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
    
    public void setNumidentidad() {
        String dep = "", mun = "", anio = "", complemento = "";
        if (this.departamento.equalsIgnoreCase("Francisco Morazan")) {
            dep = "01";
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(28) + 1;
            mun = String.format("%02d", numeroAleatorio);
            
        }
        if (this.departamento.equalsIgnoreCase("Cortes")) {
            dep = "02";
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(12) + 1;
            mun = String.format("%02d", numeroAleatorio);
        }
        if (this.departamento.equalsIgnoreCase("Comayagua")) {
            dep = "03";
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(21) + 1;
            mun = String.format("%02d", numeroAleatorio);
        }
        anio = Integer.toString(fecha.getYear()+1900);
        Random rand = new Random();
        
        int numeroAleatorio = rand.nextInt(90000) + 10000;
        complemento = Integer.toString(numeroAleatorio);
        
        numidentidad = "" + dep + mun + anio + complemento;
        
    }
    
    @Override
    public String toString() {
        
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return "Usuario: \n" + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nClave: " + clave + "\nFecha: " + sd.format(fecha) + "\nSexo=" + sexo + "\nDepartamento: " + departamento + "\nNumero de identidad=" + numidentidad + "\n";
    }
    
}
