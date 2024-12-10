package observer;

public abstract class WhatsappCreator {
    private String receptor;
    private String mensaje;

    @Override
    public Notificacion crearNotificacion(String receptor, String mensaje) {
        // ...
    }
}
