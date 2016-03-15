package demo3;

public class MakeACaptain {
    // Early initialization
    private static MakeACaptain _captain = new MakeACaptain();

    public static MakeACaptain getCaptain() {
        return _captain;
    }

    private MakeACaptain() {
    }
}
