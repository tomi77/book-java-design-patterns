package demo3;

class Observer2 implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer2: observers -> myValue is changed in " + s + " to: " + i);
    }
}
