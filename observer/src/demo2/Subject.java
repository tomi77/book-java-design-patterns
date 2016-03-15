package demo2;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        // notify observers
        notifyObservers(myValue);
    }

    List<IObserver> observerList = new ArrayList<>();

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (IObserver observer : observerList) {
            observer.update(updatedValue);
        }
    }
}
