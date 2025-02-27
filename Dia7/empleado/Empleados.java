package empleado;

public class Empleados {
    
    private String nombre;
    private double salario;
    private int horasTrabajadas;

    public Empleados(String nombre, double salario, int horasTrabajadas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularBonificacion() {
        return salario * 0.10;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
