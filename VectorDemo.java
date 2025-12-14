package collections;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Creating a Vector
        Vector<String> v = new Vector<>();

        // Adding elements
        v.add("Java");
        v.add("Selenium");
        v.add("Python");
        v.add("Testing");

        // Display Vector
        System.out.println("Vector elements: " + v);

        // Access element using index
        System.out.println("Element at index 1: " + v.get(1));

        // Remove an element
        v.remove("Python");

        // Size of Vector
        System.out.println("Size of Vector: " + v.size());

        // Iterating Vector
        System.out.println("Iterating Vector:");
        for (String element : v) {
            System.out.println(element);
        }
    }
}
