package sih;

import java.util.Date;

public class Doctor extends Poperaciones{
    
    private boolean esLider;
    private Equipo equipo;

    public Doctor(boolean esLider, Equipo equipo, String tipoOperaciones, Date fechaVinculacion, double salario, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(tipoOperaciones, fechaVinculacion, salario, titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.esLider = esLider;
        this.equipo = equipo;
    }
    
}
