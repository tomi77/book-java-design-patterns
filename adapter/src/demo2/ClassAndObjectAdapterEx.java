package demo2;

public class ClassAndObjectAdapterEx {
    public static void main(String[] args) {
        System.out.println("***Class and Object Adapter Demo***");

        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + ca1.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + oa.getInteger());
    }
}
