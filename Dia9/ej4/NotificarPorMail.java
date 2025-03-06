package ej4;

public class NotificarPorMail implements notificador{

	private static NotificarPorMail instance;

	private NotificarPorMail() {
	}

	public static NotificarPorMail getInstance() {
            if (instance == null) {
                    instance = new NotificarPorMail();
            }
            return instance;
	}
        
        @Override
        public void enviarNotificacion(Orden orden) {
            System.out.println("Notificaión de correo enviada a ordenes");
        }

}
