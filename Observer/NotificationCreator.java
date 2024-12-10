package observer;

public abstract class NotificationCreator {
    private String receptor;
    private String mensaje;

    public abstract Notificacion crearNotificacion(String receptor, String mensaje);
}
