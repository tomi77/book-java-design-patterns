package demo;

public class FlyweightPatternEx {
    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        IRobot shape;
        try {
            shape = factory.getRobotFromFactory("small");
            shape.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Here we are trying to get the objects additional 2 times. Note that from
        now onward we do not need to create additional small robots as we have
        already created this category */
        for (int i = 0; i < 2; i++)
        {
            try {
                shape = factory.getRobotFromFactory("small");
                shape.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int numOfDistinctRobots = factory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now: " + numOfDistinctRobots);

        /* Here we are trying to get the objects 5 times. Note that the second time
        onward we do not need to create additional large robots as we have already
        created this category in the first attempt(at i=0) */
        for (int i = 0; i < 5; i++)
        {
            try {
                shape = factory.getRobotFromFactory("large");
                shape.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        numOfDistinctRobots = factory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + numOfDistinctRobots);
    }
}
