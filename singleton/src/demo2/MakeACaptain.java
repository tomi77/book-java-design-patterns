package demo2;

public class MakeACaptain {
    private static MakeACaptain _captain;

    public static synchronized MakeACaptain getCaptain() {
        if (_captain == null) {
            _captain = new MakeACaptain();
            System.out.println("New Captain selected for out team");
        } else {
            System.out.print("You already have a Captain for our team.");
            System.out.println("Send him for the toss.");
        }
        return _captain;
    }

    private MakeACaptain() {
    }
}
