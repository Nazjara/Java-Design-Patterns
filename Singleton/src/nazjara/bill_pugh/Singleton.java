package nazjara.bill_pugh;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonInstance.singleton;
    }

    private static class SingletonInstance {
        private static final Singleton singleton = new Singleton();
    }
}
