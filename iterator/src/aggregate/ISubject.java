package aggregate;

import iterator.IIterator;

public interface ISubject {
    IIterator CreateIterator();
}
