package singleton;

import model.*;

public class IncidenteManager {
    private static IncidenteManager instance = new IncidenteManager();

    private IncidenteManager() {
    }

    public static IncidenteManager getInstance() {
        return instance;
    }

    public static void revisarIncidente(Incidente incidente) {
        // ...
    }

    public static void manejarIncidente(ManejadorIncidentes manejador) {
        // ...
    }
}
