package ej2;

public class AuditTransfMonet {

    private servicioTransferencia transferenciaService;
    private servicioNotificacion notificacionService;

    public AuditTransfMonet(servicioTransferencia transferenciaService, servicioNotificacion notificacionService) {
        this.transferenciaService = transferenciaService;
        this.notificacionService = notificacionService;
    }

    public void transferenciaRealizada(Transferencia transferencia) {
        if (transferenciaService.esTransferenciaImportante(transferencia)) {
            notificacionService.notificarAuditor(transferencia);
        }
    }
}
