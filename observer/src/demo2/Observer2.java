package demo2;

class Observer2 implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Observer2: observer -> myValue is changed in Subject to: " + i);
    }
}
