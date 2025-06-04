package collections.List.Vector;

//Vector is a growable array in Java, similar to ArrayList, but it is synchronized — which means it is thread-safe (safe to use in multi-threaded programs).
//It is part of the java.util package and implements the List interface.
//
//How it works:
//Internally, Vector uses a dynamic array to store elements.
//When the array is full, it doubles its size to add more elements.
//All methods are synchronized, so only one thread can access it at a time (which makes it slower than ArrayList in single-threaded apps).
//
//Commonly Used Vector Methods Summary:
//Method	      -->Description
//add(element)	     Add element at end
//add(index, element)	 Add element at specific index
//get(index)	         Get element by index
//set(index, element)	Replace element at index
//remove(index)	    Remove element by index
//remove(Object)  	Remove element by value
//contains(element)	Checks if element exists
//size()           	Returns number of elements
//isEmpty()       	Checks if vector is empty
//firstElement()  	Returns first element
//lastElement()	    Returns last element
//clear()	            Removes all elements
//elementAt(index)	Similar to get(index)
//capacity()      	Returns current capacity (not size)

import java.util.Vector;

public class basic {

    public static void main(String[] args) {
        // ✅ 1. Create a Vector
        Vector<String> vector = new Vector<>();

        // ✅ 2. Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");

        // ✅ 3. Print the vector
        System.out.println("Original Vector: " + vector);

        // ✅ 4. Add element at specific index
        vector.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + vector);

        // ✅ 5. Get element at index
        System.out.println("Element at index 2: " + vector.get(2));

        // ✅ 6. Replace an element
        vector.set(0, "Pineapple");
        System.out.println("After replacing Apple with Pineapple: " + vector);

        // ✅ 7. Remove by index
        vector.remove(2);
        System.out.println("After removing element at index 2: " + vector);

        // ✅ 8. Remove by value
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        // ✅ 9. Check if contains an element
        System.out.println("Contains Mango? " + vector.contains("Mango"));

        // ✅ 10. Get size
        System.out.println("Size of vector: " + vector.size());

        // ✅ 11. Check if empty
        System.out.println("Is vector empty? " + vector.isEmpty());

        // ✅ 12. First and Last Element
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // ✅ 13. Loop through elements
        System.out.println("Loop using for-each:");
        for (String item : vector) {
            System.out.println(item);
        }

        // ✅ 14. Clear all elements
        vector.clear();
        System.out.println("After clearing vector: " + vector);
        System.out.println("Is empty after clear()? " + vector.isEmpty());
    }
}
