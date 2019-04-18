package nazjara.example1;

public class ConcreteDecorator2 extends AbstractDecorator {

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("In decorator we can extend functionality from component - second");
    }
}
