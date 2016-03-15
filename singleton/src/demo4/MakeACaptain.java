package demo4;

public class MakeACaptain {
    // Bill Pugh solution
    private static class SingletonHelper {
        // Nested class in referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }
    public static MakeACaptain getCaptain() {
        return SingletonHelper._captain;
    }

    private MakeACaptain() {
    }
}
