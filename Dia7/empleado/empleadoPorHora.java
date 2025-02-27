package empleado;

public class empleadoPorHora extends Empleados{

    public empleadoPorHora(String nombre, double salario, int horasTrabajadas) {
        super(nombre, salario, horasTrabajadas);
    }
    
    @Override
    public double calcularBonificacion() {
        if(getHorasTrabajadas() > 30) {
            System.out.println("Bonificación del 15%");
            return getSalario() * 0.15;
        }
        System.out.println("Bonificación de 10%");
        return super.calcularBonificacion();
    }
}
