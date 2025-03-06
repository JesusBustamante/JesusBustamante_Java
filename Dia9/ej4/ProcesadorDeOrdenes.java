package ej4;

public class ProcesadorDeOrdenes {

    private notificador Notificador;

    public ProcesadorDeOrdenes(notificador Notificador) {
        this.Notificador = Notificador;
    }
    
    public void procesar(Orden orden) {
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            Notificador.enviarNotificacion(orden);
        }
    }
}
