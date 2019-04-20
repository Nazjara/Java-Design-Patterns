package nazjara;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> robots = new HashMap<>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface robot;

        if(robots.containsKey(robotType)) {
            System.out.println("Getting already existing robot");
            robot = robots.get(robotType);
        } else {
            switch (robotType.toLowerCase()) {
                case "king":
                    System.out.println("Creating new king robot");
                    robot = new Robot("King");
                    robots.put("King", robot);
                    break;
                case "queen":
                    System.out.println("Creating new queen robot");
                    robot = new Robot("Queen");
                    robots.put("Queen", robot);
                    break;
                default:
                    throw new Exception("Unknown robot type");
            }
        }

        return robot;
    }
}
