package robotfacade;

import robotparts.RobotBody;
import robotparts.RobotColor;
import robotparts.RobotMetal;

public class RobotFacade {
    RobotColor robotColor;
    RobotMetal robotMetal;
    RobotBody robotBody;

    public RobotFacade() {
        robotColor = new RobotColor();
        robotMetal = new RobotMetal();
        robotBody = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        robotBody.createBody();
        System.out.println("\nRobot Creation End");
        System.out.println();
    }
}
