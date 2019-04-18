package nazjara.example1;

public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("Concrete component is closed for modifications");
    }
}
