package demo2;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotType) throws Exception {
        IRobot robot;

        if (shapes.containsKey(robotType)) {
            robot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have King Robot. So we are creating a King Robot now.");
                    robot = new Robot("King");
                    shapes.put(robotType, robot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now.");
                    robot = new Robot("Queen");
                    shapes.put(robotType, robot);
                    break;
                default:
                    throw new Exception("Robot Factory can create only king and queen type robots.");
            }
        }

        return robot;
    }
}
