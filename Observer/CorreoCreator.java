package observer;

public abstract class CorreoCreator {
    private String receptor;
    private String mensaje;

    @Override
    public Notificacion crearNotificacion(String receptor, String mensaje) {
        // ...
    }
}
