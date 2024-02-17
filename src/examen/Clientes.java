package examen;

import java.util.ArrayList;
import java.util.Date;

public class Clientes extends Usuario {

    ArrayList<Tramites> tramite = new ArrayList();

    public Clientes(String nombre, String apellido, String clave, Date fecha, String sexo, String departamento) {
        super(nombre, apellido, clave, fecha, sexo, departamento);
    }

    public ArrayList<Tramites> getTramite() {
        return tramite;
    }

    public void setTramite(ArrayList<Tramites> tramite) {
        this.tramite = tramite;
    }

    @Override
    public String toString() {
        return super.toString() + "Clientes: \n " + "\nTramite: " + tramite + "\n";
    }

}
