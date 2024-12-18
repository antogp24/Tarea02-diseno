package singleton;

import model.*;

public class OperadorHotel implements ManejadorIncidentes {
    private String datosHotel;

    @Override
    public void manejar(Incidente incidente) {
        // ...
    }

    public boolean puedeManejar(Incidente incidente) {
        return true;
    }
}
