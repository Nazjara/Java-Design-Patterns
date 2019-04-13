package nazjara.lazy_synchronized;

public class Singleton {

    private Singleton() {
    }

    private static Singleton singletonInstance = null;

    public static synchronized Singleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }
}
