package nazjara;

public class Computer {
    private DisplayModule dm;

    public void setDm(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        Monitor monitor = new Monitor();
        Projector projector = new Projector();

        computer.setDm(monitor);
        computer.display();
        computer.setDm(projector);
        computer.display();
    }
}
