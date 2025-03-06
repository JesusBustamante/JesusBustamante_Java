package ej6;

public class enviarEmail implements IMailSender{
    
    @Override
    public void Enviar(String destinatario, String cuerpoMensaje) {
        System.out.println("Email enviado a: " + destinatario);
    }
            
}
