package demo;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotCategory) throws Exception {
        IRobot robot;

        if (shapes.containsKey(robotCategory)) {
            robot = shapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot now.");
                    robot = new SmallRobot();
                    shapes.put(robotCategory, robot);
                    break;
                case "large":
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot now.");
                    robot = new LargeRobot();
                    shapes.put(robotCategory, robot);
                    break;
                default:
                    throw new Exception("Robot factory can create only small and large shapes.");
            }
        }

        return robot;
    }
}
