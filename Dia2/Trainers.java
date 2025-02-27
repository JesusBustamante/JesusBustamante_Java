package campuslands_bustamantejesus;

public class Trainers {
    int id;
    String nombre;
    String apellidos;
    String contrasena;
    String ruta;

    public Trainers(int id, String nombre, String apellidos, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.ruta = "Java";
    }
    
    @Override
    public String toString() {
    return "Trainers{" +
            "ID=" + id +
            ", Nombre='" + nombre + '\'' +
            ", Apellidos='" + apellidos + '\'' +
            ", Contraseña='" + contrasena + '\'' +
            ", Ruta='" + ruta + '\'' +
            '}';
}


}
