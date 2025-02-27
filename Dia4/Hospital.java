package sih;

import java.util.List;

public class Hospital {
    
    private String nombre;
    private List<Departamento> departamentos;
    private List<Persona> empleados;

    public Hospital(String nombre, List<Departamento> departamentos, List<Persona> empleados) {
        this.nombre = nombre;
        this.departamentos = departamentos;
        this.empleados = empleados;
    }
    
}
