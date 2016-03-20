package color;

public class Green implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border.");
    }
}
