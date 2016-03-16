package iterator;

public interface IIterator {
    void first();  // Reset to first element
    String next();  // get next element
    Boolean isDone();  // End of collection check
    String currentItem();  // Retrive current item
}
