package nazjara.eager_evaluation;

public class Singleton {

    private Singleton() {
    }

    private static Singleton singletonInstance = new Singleton();

    public static Singleton getInstance() {
        return singletonInstance;
    }
}
