package demo;

public abstract class Friend {
    protected Mediator mediator;

    public String name;

    public Friend(Mediator mediator) {
        this.mediator = mediator;
    }
}
