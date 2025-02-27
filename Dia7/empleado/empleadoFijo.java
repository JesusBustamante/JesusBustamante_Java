package empleado;

public class empleadoFijo extends Empleados{

    public empleadoFijo(String nombre, double salario, int horasTrabajadas) {
        super(nombre, salario, horasTrabajadas);
    }
    
    @Override
    public double calcularBonificacion() {
        if(getHorasTrabajadas() > 40) {
            System.out.println("Bonificación del 20%");
            return getSalario() * 0.20;
        }
        System.out.println("Bonificación de 10%");
        return super.calcularBonificacion();
    }
}
