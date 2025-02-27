package vehiculo;

public class Vehiculo {
    
    private String marca;
    private String modelo;

    public Vehiculo() {}
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
     public String getModelo() {
        return modelo;
    }
    
    public void mostrarDetalles() {
        System.out.println("Información del vehículo");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
