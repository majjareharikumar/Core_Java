package collections.List.LinkedList;

//LinkedList is a linear data structure that stores elements (called nodes) in a sequence,
// where each element points to the next.
// It has three parts – Reference To Previous Element, Value Of The Element and Reference To Next Element.

//Summary of Methods Used:
//        Method	        -->Purpose
//        add(value)	   -->    -Add at end
//        add(index, value)	-->Add at specific index
//        addFirst(value)--->	Add at beginning
//        addLast(value)  -->	Add at end
//        get(index)    -->	Get element at index
//        set(index, value)  -->	Replace element at index
//        remove(value)    -->	Remove by value
//        remove(index)   -->	Remove by index
//        removeFirst()  -->	Remove first element
//        removeLast()  -->	Remove last element
//        contains(value)  -->	Check if element exists
//        size()	-- >Get number of elements
//        isEmpty()  _	Check if list is empty
//        clear()  -->	Remove all elements

import java.util.LinkedList;
import java.util.List;

public class basic {
    public static void main(String[] args) {
        List<String> ll=new LinkedList<>();

        //Adding values
        ll.add("Hari");
        ll.add("Nath");
        ll.add("Kumar");
        ll.add("Ram");
        System.out.println("Original Linked list:- "+ll);

        // add value at specific index
        ll.add(0,"Majjare");
        System.out.println("Linked list after adding value at 0 index :- "+ll);

        //adding value at first index
        ll.addFirst("Hani");
        System.out.println("Linked list after adding value at first index:- "+ll);

        //adding value at last index
        ll.addLast("Mani");
        System.out.println("Linked list after adding value at Last index:- "+ll);

        //Get the value at specific index
        System.out.println("Linked List value at the index of 2 :-"+ll.get(2));

        //get  the first values in the list
        System.out.println("first Values in the Linked List:- "+ll.getFirst());

        //get  the last values in the list
        System.out.println("last Values in the Linked List:- "+ll.getLast());

        //update the value at the specific index
        ll.set(6,"Rani");
        System.out.println("Linked list after updating the value Mani to Rani:- "+ll);

        //remove the Rani
        ll.remove("Rani");
        System.out.println("Linked list after removing the Rani:- "+ll);

        //remove first value
        ll.removeFirst();
        System.out.println("Linked list after removing the first value:- "+ll);

        //remove the last
        ll.removeLast();
        System.out.println("Linked list after removing the last value:- "+ll);

        //check the values, is it available or not
        System.out.println("Is Hari present in linked List?:- "+ll.contains("Hari"));

        //check the size of the list
        System.out.println("Size of list:- "+ll.size());

        //check is list empty?
        System.out.println("Is list Empty?:- "+ll.isEmpty());

        //clear the list
        ll.clear();
        System.out.println("After clearing the list:- "+ll);
        System.out.println("Is list empty:- "+ll.isEmpty());
    }
}
