package demo2;

public class Robot implements IRobot {
    private String robotType;

    public String color;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + color + " color");
    }
}
