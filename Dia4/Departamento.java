package sih;

import java.util.List;

public class Departamento {
    
    private String nombre;
    private List<Persona> personal;

    public Departamento(String nombre, List<Persona> personal) {
        this.nombre = nombre;
        this.personal = personal;
    }
    
}
