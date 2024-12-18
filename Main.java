import Singleton.*;

public class Main {
    public static void main(String[] args) {
        MainManager mainManager = MainManager.getInstance();
        mainManager.execute();
    }
}
