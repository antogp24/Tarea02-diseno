package singleton;

public class MainManager {
    private static ReservacionManager reservacionManager = ReservacionManager.getInstance();
    private static IncidenteManager incidenteManager = IncidenteManager.getInstance();
    private static NotificadorManager notificadorManager = NotificadorManager.getInstance();
    private static AgregadorServicioManager agregador = AgregadorServicioManager.getInstance();

    public static ReservacionManager getReservacionManager() {
        return reservacionManager;
    }

    public static IncidenteManager getIncidenteManager() {
        return incidenteManager;
    }

    public static NotificadorManager getNotificadorManager() {
        return notificadorManager;
    }

    public void execute() {
        // ...
    }
}
