package demo;

import java.util.LinkedList;

public class Product {
    // We can use any data structure that you prefer. We have used LinkedList here.
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    // Adding parts
    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\nProduct completed as below:");
        parts.forEach(System.out::println);
    }
}
