package sih;

import java.time.LocalDate;

public class Paciente extends Persona{
    
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private Pabellon pabellon;

    public Paciente(LocalDate fechaNacimiento, LocalDate fechaIngreso, Pabellon pabellon, String titulo, String nombrePila, String segundoNombre, String apellidos, String direccion) {
        super(titulo, nombrePila, segundoNombre, apellidos, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.pabellon = pabellon;
    }
    
}
