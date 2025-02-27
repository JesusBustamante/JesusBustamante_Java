package sih;

import java.util.Date;

public class Padministrativo extends Empleado{
    
    private String tipoadministrativo;

    public Padministrativo(String tipoadministrativo, Date fechaVinculacion, double salario, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(fechaVinculacion, salario, titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.tipoadministrativo = tipoadministrativo;
    }
    
    
}
