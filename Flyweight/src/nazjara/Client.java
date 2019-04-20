package nazjara;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory factory = new RobotFactory();

        RobotInterface kingRobot = factory.getRobotFromFactory("King");
        kingRobot.print();

        for (int i = 0; i < 3; i++) {
            kingRobot = factory.getRobotFromFactory("King");
            kingRobot.setColor(getColor(i));
            kingRobot.print();
        }

        System.out.println("Total number of objects created - " + factory.totalObjectsCreated());

        RobotInterface queenRobot = factory.getRobotFromFactory("Queen");
        queenRobot.print();

        for (int i = 0; i < 3; i++) {
            queenRobot = factory.getRobotFromFactory("Queen");
            queenRobot.setColor(getColor(i));
            queenRobot.print();
        }

        System.out.println("Total number of objects created - " + factory.totalObjectsCreated());
    }

    private static String getColor(int i) {
        switch (i) {
            case 0: return "Red";
            case 1: return "Green";
            case 2: return "Blue";
            default: return null;
        }
    }
}
