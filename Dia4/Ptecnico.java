package sih;

import java.util.Date;

public class Ptecnico extends Empleado{
    
    private String tipoTecnico;

    public Ptecnico(String tipoTecnico, Date fechaVinculacion, double salario, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(fechaVinculacion, salario, titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.tipoTecnico = tipoTecnico;
    }
    
}
