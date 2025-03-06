package ej2;

public class servicioEmail {
    
    private ConexionMail conexionMail;

    public servicioEmail() {
        this.conexionMail = ConexionMail.getInstance();
    }

    public void enviarMail(String auditor, String mensaje) {
        try {
            conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
        } finally {
            conexionMail.cerrar();
        }
    }
}
