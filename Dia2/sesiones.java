package campuslands_bustamantejesus;

public class sesiones {

    int id;
    String nombre;
    String apellidos;
    String fechaSesion;
    String actividad;  

    public sesiones(String nombre, String apellidos, String fechaSesion, String actividad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaSesion = fechaSesion;
        this.actividad = "Revisión de Datos Personales";
    }
    
    
    @Override
    public String toString() {
        return "Sesiones{" +
                "id=" + id +
                ", nombre = '" + nombre + '\'' +
                ", apellidos = '" + apellidos + '\'' +
                ", fechaSesion = " + fechaSesion +
                ", actividad = '" + actividad + '\'' +
                '}';
    }

}

