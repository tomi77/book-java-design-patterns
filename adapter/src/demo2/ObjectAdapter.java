package demo2;

public class ObjectAdapter {
    private IIntegerValue myInt;

    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }

    // Incrementing by 2
    public int getInteger() {
        return 2 + myInt.getInteger();
    }
}
