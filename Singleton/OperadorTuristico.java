package singleton;

public class OperadorTuristico implements ManejadorIncidentes {
    private String datosOperador;

    @Override
    public void manejar(Incidente incidente) {
        // ...
    }

    @Override
    public boolean puedeManejar(Incidente incidente) {
        return true;
    }
}
