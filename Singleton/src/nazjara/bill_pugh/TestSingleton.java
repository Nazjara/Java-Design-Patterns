package nazjara.bill_pugh;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("First reference: " + singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second reference: " + singleton2);

        if(singleton1 == singleton2) {
            System.out.println("References are the same");
        }
    }
}
