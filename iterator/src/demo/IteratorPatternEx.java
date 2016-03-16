package demo;

import aggregate.Arts;
import aggregate.ISubject;
import aggregate.Science;
import iterator.IIterator;

public class IteratorPatternEx {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject scSubjects = new Science();
        ISubject arSubjects = new Arts();

        IIterator scIterator = scSubjects.CreateIterator();
        IIterator arIterator = arSubjects.CreateIterator();

        System.out.println("\nScience subjects:");
        Print(scIterator);

        System.out.println("\nArts subjects:");
        Print(arIterator);
    }

    public static void Print(IIterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
