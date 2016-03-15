package demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<Observer> observerList = new ArrayList<>();
    private int _flag;

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public int get_flag() {
        return _flag;
    }

    public void set_flag(int _flag) {
        this._flag = _flag;
        // flag value changed. So notify observers
        notifyObservers();
    }
}
