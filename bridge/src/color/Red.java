package color;

public class Red implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " inch border.");
    }
}
