package ej2;

public class servicioTransferencia {
    public boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}
