package examen;

import examen.Usuario;
import java.util.Date;

public class Empleados extends Usuario {

    private String carrera;
    private String puestol;
    private double anios;

    public Empleados(String nombre, String apellido, String clave, Date fecha, String sexo, String departamento, String numidentidad, String carrera, String puestol, double anios) {
        super(nombre, apellido, clave, fecha, sexo, departamento, numidentidad);
        this.carrera = carrera;
        this.puestol = puestol;
        this.anios = anios;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getPuestol() {
        return puestol;
    }

    public double getAnios() {
        return anios;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPuestol(String puestol) {
        this.puestol = puestol;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados: \n" + "\nCarrera: " + carrera + "\nPuesto Laboral: " + puestol + "\nAnios de Trabajo: " + anios+"\n";
    }

}
