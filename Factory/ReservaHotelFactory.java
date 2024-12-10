package factorymethod;

public class ReservaHotelFactory implements ReservaFactory {
    @Override
    public Reserva generar() {
    }

    public ReservacionEstandar reservarEstandar() {
        return new ReservacionEstandar();
    }

    public ReservacionFamiliar reservarFamiliar() {
        return new ReservacionFamiliar();
    }

    public ReservacionSuite reservarSuite() {
        return new ReservacionSuite();
    }
}
