package ej2;

public class servicioNotificacion {
    private servicioEmail mailService;

    public servicioNotificacion(servicioEmail mailService) {
        this.mailService = mailService;
    }

    public void notificarAuditor(Transferencia transferencia) {
        String auditor = "mail-auditor";
        String mensaje = "aviso-transferencia-importante";
        mailService.enviarMail(auditor, mensaje);
    }
}
