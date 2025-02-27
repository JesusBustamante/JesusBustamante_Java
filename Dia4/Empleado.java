package sih;

import java.util.Date;

public class Empleado extends Persona{
    
    private Date fechaVinculacion;
    private double salario;

    public Empleado(Date fechaVinculacion, double salario, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
    }
   
}
