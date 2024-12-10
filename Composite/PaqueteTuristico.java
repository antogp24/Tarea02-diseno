package composite;

import java.util.List;

public class PaqueteTuristico {
    List<Reservacion> paquete;
    List<Adicional> adicionales;

    public void agregarComponente(Reservacion reservacion) {
        paquete.add(reservacion);
    }

    public void quitarComponente(Reservacion reservacion) {
        paquete.remove(reservacion);
    }

    public void agregarAdicional(Adicional adicional) {
        adicionales.add(adicional);
    }

    public List<Reservacion> getPaquete() {
        return this.paquete;
    }
}
