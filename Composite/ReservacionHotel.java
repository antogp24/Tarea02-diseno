package composite;

public class ReservacionHotel implements Reservacion {
    protected int numCamas;
    protected String estado;
    protected String correoUsuario;

    @Override
    public void confirmar() {
        // ...
    }

    @Override
    public void cancelar() {
        // ...
    }
}
