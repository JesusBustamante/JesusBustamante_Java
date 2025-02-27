
package campuslands_bustamantejesus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Campers {
    int id;
    String nombre;
    String apellidos;
    String direccion;
    String celular;
    String acudiente;
    String trainer;
    String ruta;
    LocalDate fechaInicio;
    LocalDate fechaFinalizacion;
    LocalDateTime fechaSesion;
    String actividad;
    String estado;

    public Campers(int id, String nombre, String apellidos, String direccion, String celular, String acudiente, String trainer, String ruta, LocalDate fechaInicio, LocalDate fechaFinalizacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.acudiente = acudiente;
        this.trainer = trainer;
        this.ruta = ruta;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }    

    public Campers(String nombre, String apellidos, LocalDateTime fechaSesion, String actividad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaSesion = fechaSesion;
        this.actividad = "Revisión de Datos Personales";
    }

    public Campers(int id, String nombre, String apellidos, String direccion, String celular, String acudiente, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
        this.acudiente = acudiente;
        this.estado = estado;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Campers{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", celular='" + celular + '\'' +
                ", acudiente='" + acudiente + '\'' +
                ", trainer='" + trainer + '\'' +
                ", ruta='" + ruta + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinalizacion=" + fechaFinalizacion +
                ", fechaSesion=" + fechaSesion +
                ", actividad='" + actividad + '\'' +
                ", estado='" + estado + '\'' +'}';
    }

}
