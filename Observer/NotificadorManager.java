package observer;

public class NotificadorManager {
    private static NotificadorManager instance = new NotificadorManager();

    private NotificadorManager() {
    }

    public static NotificadorManager getInstance() {
        return instance;
    }

    public static void enviarNotificacion(Reservacion reservacion) {
        // ...
    }
}
