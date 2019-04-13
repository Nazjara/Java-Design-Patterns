package nazjara.lazy_initialization;

public class Singleton {

    private Singleton() {
    }

    private static Singleton singletonInstance = null;

    public static Singleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }
}
