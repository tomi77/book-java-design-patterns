package demo;

public class Friend2 extends Friend {
    public Friend2(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.printf(name + " gets message: " + msg + "\n");
    }
}
