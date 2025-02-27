package campuslands_bustamantejesus;

public class notaModulo {
    int id;
    String nombre;
    String apellidos;
    String tipoPrueba;
    double nota;
    String estado;

    public notaModulo(int id, String nombre, String apellidos, String tipoPrueba, double nota, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoPrueba = tipoPrueba;
        this.nota = nota;
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "notaModulo {id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + 
           ", tipoPrueba=" + tipoPrueba + ", nota=" + nota + ", estado=" + estado + "}";
    }

}
