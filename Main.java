import Singleton.*;

public class Main {
    public static void main(String[] args) {
        singleton.MainManager mainManager = singleton.MainManager.getInstance();
        mainManager.execute();
    }
}
