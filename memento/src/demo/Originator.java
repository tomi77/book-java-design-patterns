package demo;

public class Originator {
    private String state;

    Memento memento;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present: " + state);
    }

    public Memento originatorMemento() {
        return new Memento(state);
    }

    public void revert(Memento memento) {
        System.out.println("Restore to previous state");
        state = memento.getState();
        System.out.println("State at present: " + state);
    }
}
