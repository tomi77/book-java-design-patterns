package shape;

import color.IColor;

public class Rectangle extends Shape {
    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    public void drawShape(int border) {
        System.out.print("This Rectangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times.");
        border *= increment;
        drawShape(border);
    }
}
