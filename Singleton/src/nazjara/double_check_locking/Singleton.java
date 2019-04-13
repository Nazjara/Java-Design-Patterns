package nazjara.double_check_locking;

public class Singleton {

    private Singleton() {
    }

    private volatile static Singleton singletonInstance = null;

    public static Singleton getInstance() {
        if(singletonInstance == null) {
            synchronized (Singleton.class) {
                if(singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }

        return singletonInstance;
    }
}
