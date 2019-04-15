package nazjara.object_adapter.turkey_duck;

public class Client {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says ....");
        duck.quack();
        duck.fly();

        System.out.println("TurkeyAdapter says ....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
