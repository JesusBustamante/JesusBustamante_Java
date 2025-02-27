package vehiculo;

public class Auto extends Vehiculo{
    
    private int numeroPuertas;
    private String tipoCombustible;
    private boolean tieneAireAcondicionado;

    public Auto(int numeroPuertas, String tipoCombustible, boolean tieneAireAcondicionado, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Información del auto");
        System.out.println("----------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Aire acondicionado: " + (tieneAireAcondicionado ? "Si" : "No"));
    }
}
