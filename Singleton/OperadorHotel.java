package singleton;

public class OperadorHotel implements ManejadorIncidentes {
    private String datosHotel;

    @Override
    public void manejar(Incidente incidente) {
        // ...
    }

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return true;
    }
}
