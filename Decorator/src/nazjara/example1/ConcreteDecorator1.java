package nazjara.example1;

public class ConcreteDecorator1 extends AbstractDecorator {

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("In decorator we can extend functionality from component - first");
    }
}
