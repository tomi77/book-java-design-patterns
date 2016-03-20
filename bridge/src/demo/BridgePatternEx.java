package demo;

import color.Green;
import color.IColor;
import color.Red;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class BridgePatternEx {
    public static void main(String[] args) {
        System.out.println("*****BRIDGE PATTERN*****");

        // Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        IColor green = new Green();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);

        // Modifying the border length
        triangleShape.modifyBorder(20, 3);

        // Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle:");
        IColor red = new Red();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);

        // Modifying the border length twice
        rectangleShape.modifyBorder(50, 2);
    }
}
