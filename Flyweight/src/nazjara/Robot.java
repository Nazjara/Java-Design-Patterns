package nazjara;

public class Robot implements RobotInterface {
    String color;
    // this is intrinsic data (should be set from factory)
    String robotType;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + color + " color");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
