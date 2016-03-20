package shape;

import color.IColor;

abstract public class Shape {
    // Composition
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    public abstract void drawShape(int border);

    public abstract void modifyBorder(int border, int increment);
}
