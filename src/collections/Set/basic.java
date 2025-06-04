package collections.Set;

//Commonly Used Methods in Set
//Since Set extends Collection, it inherits these methods:
//
//Method	                Description
//add(E e)	            Adds element if not already present
//addAll(Collection c)	Adds all elements from another collection
//remove(Object o)	    Removes the element if present
//contains(Object o)	    Checks if element exists
//isEmpty()	            Checks if set is empty
//size()	                Returns number of elements
//clear()	                Removes all elements
//iterator()	             Returns an iterator over the set


import java.util.*;

public class basic {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate, will not be added

        System.out.println("Set: " + fruits);  // No duplicates

        // Check for element
        System.out.println("Contains Banana? " + fruits.contains("Banana"));  // true

        // Remove element
        fruits.remove("Orange");

        // Size
        System.out.println("Size: " + fruits.size());  // 2

        // Loop through set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("Is empty? " + fruits.isEmpty());  // true
    }
    }

