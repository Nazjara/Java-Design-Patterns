package nazjara.example1;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.doJob();

        System.out.println("-----------------------");

        ConcreteDecorator1 decorator1 = new ConcreteDecorator1();
        decorator1.setComponent(component);
        decorator1.doJob();

        System.out.println("-----------------------");

        ConcreteDecorator2 decorator2 = new ConcreteDecorator2();
        decorator2.setComponent(decorator1);
        decorator2.doJob();
    }
}
