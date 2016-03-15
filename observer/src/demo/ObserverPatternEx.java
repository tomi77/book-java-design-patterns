package demo;

public class ObserverPatternEx {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");
        Observer o1 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        System.out.println("Setting flag = 5");
        sub1.set_flag(5);
        System.out.println("Setting flag = 25");
        sub1.set_flag(25);
        sub1.unregister(o1);
        // No notification this to o1. Since this is unregistered.
        System.out.println("Setting flag = 50");
        sub1.set_flag(50);
    }
}