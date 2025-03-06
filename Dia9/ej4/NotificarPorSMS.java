package ej4;

public class NotificarPorSMS implements notificador{
    @Override
        public void enviarNotificacion(Orden orden) {
            System.out.println("Notificaión de SMS enviada a ordenes");
        }
}
