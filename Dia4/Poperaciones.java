package sih;

import java.util.Date;

public class Poperaciones extends Empleado{
    
    private String tipoOperaciones;

    public Poperaciones(String tipoOperaciones, Date fechaVinculacion, double salario, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(fechaVinculacion, salario, titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.tipoOperaciones = tipoOperaciones;
    }
    
}
