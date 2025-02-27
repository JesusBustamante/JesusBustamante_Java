package empleado;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        List<Empleados> empleados = new ArrayList<>();
        
        empleados.add(new empleadoFijo("Carlos", 3000, 45)); // 20% porque trabaja más de 40h
        empleados.add(new empleadoFijo("Ana", 2500, 38)); // 10% porque trabaja menos de 40h
        empleados.add(new empleadoPorHora("Luis", 2000, 35)); // 15% porque trabaja más de 30h
        empleados.add(new empleadoPorHora("Sofia", 1800, 28)); // 10% porque trabaja menos de 30h
        
        for(Empleados e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Salario: " + e.getSalario());
            System.out.println("Horas trabajadas: " + e.getHorasTrabajadas());
            System.out.println("Bonificación: " + e.calcularBonificacion());
            System.out.println("--------------------------");
        }
        
    }
    
}
