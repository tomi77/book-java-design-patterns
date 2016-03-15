package demo3;

class Observer3 implements IObserver {
    @Override
    public void update(String s, int i) {
        System.out.println("Observer3: is observin: myValue in changed in " + s + " to: " + i);
    }
}
