package Singleton;
import model.*;

public class AgenteSoporte implements ManejadorIncidentes {
    private String datosAgente;

    @Override
    public void manejar(Incidente incidente) {
        // ...
    }

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return true;
    }
}
