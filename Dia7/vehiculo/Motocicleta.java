package vehiculo;

public class Motocicleta extends Vehiculo{
    
    private int cilindrada;
    private boolean tieneArranqueElectrico;
    private String tipo;

    public Motocicleta(int cilindrada, boolean tieneArranqueElectrico, String tipo, String marca, String modelo) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
        this.tieneArranqueElectrico = tieneArranqueElectrico;
        this.tipo = tipo;
    }

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Información de la motocicleta");
        System.out.println("-------------------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de puertas: " + cilindrada);
        System.out.println("Aire acondicionado: " + (tieneArranqueElectrico ? "Si" : "No"));
        System.out.println("Tipo de motocicleta: " + tipo);
    }
    
}
