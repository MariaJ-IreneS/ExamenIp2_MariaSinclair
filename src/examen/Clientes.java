package examen;

import java.util.ArrayList;
import java.util.Date;

public class Clientes extends Usuario {

    ArrayList<Tramites> tramite;

    public Clientes(String nombre, String apellido, String clave, Date fecha, String sexo, String departamento, ArrayList tramite) {
        super(nombre, apellido, clave, fecha, sexo, departamento);
        this.tramite = tramite;
    }


    @Override
    public String toString() {
        return "Clientes: \n " + "\nTramite: " + tramite + "\n";
    }

}
