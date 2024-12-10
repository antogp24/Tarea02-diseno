package factorymethod;

public class ReservaPaseoFactory implements ReservaFactory {
    @Override
    public Reserva generar() {
    }

    public PaseoAventura reservarPaseoAventura() {
        return new PaseoAventura();
    }

    public PaseoCultural reservarPaseoCultural() {
        return new PaseoCultural();
    }
}
