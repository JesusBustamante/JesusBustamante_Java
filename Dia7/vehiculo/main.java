package vehiculo;

public class main {
    
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto(5, "Gasolina", true, "Chevrolet", "Camaro");
        miAuto.mostrarDetalles();
        System.out.println("");
        Vehiculo miMotocicleta = new Motocicleta(200, true, "Deportiva", "Pulsar", "NS");
        miMotocicleta.mostrarDetalles();
    }
    
}
