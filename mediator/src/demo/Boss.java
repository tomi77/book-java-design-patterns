package demo;

public class Boss extends Friend {
    public Boss(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String msg) {
        mediator.send(this, msg);
    }

    public void notify(String msg) {
        System.out.printf("Boss sees message: " + msg + "\n");
    }
}
