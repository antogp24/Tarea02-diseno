package Singleton;
import model.*;

public class ReservacionManager {
    private static ReservacionManager instance = new ReservacionManager();

    private ReservacionManager() {
    }

    static public ReservacionManager getInstance() {
        return instance;
    }

    static public boolean revisarDisponible(Reservacion reservacion) {
        return true;
    }
}
