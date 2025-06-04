package collections.List.Stack;

//A Stack is a Last-In, First-Out (LIFO) data structure.
//        In Java, the Stack class is a legacy class in java.util package that extends Vector and provides stack-specific methods like push(), pop(), and peek().
//
//Commonly Used Stack Methods:
//Method	             Description
//push(element)	    Adds element to the top of the stack
//pop()	            Removes and returns the top element
//peek()	            Returns the top element without removing
//search(obj)      	Returns position from top (1-based); returns -1 if absent
//isEmpty()	        Checks if the stack is empty
//size()	            Returns the number of elements
//clear()	            Removes all elements (from Vector)

import java.util.List;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        //Create stack
        Stack<Integer> s=new Stack<>();

        //capasicty of stack
        System.out.println("Capacity of Stack:- "+s.capacity());

        //add values to the stack
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1,4);

        System.out.println("Original Stack "+s);

        //add value to top
        s.push(4);
        System.out.println("Stack after pushing the value(4):- "+s);

        //get the value without removing
        System.out.println("Top value with out removing:- "+s.peek());

        //get the value by removing
        System.out.println("Top value by removing:- "+s.pop());
        System.out.println("Stack after removing the top value :- "+s);

        //Is contains the values or not
        System.out.println("Is contains the value 3:- "+s.search(3));

        //Check if the stack is empty
        System.out.println("Is stack empty:- "+s.isEmpty());

        //size of stack
        System.out.println("size of stack :- "+s.size());

        //clear the stack
        s.clear();
        System.out.println("Stack after clearing the values :- "+s);
        System.out.println("after clearing the Stack,Is stack empty? :- "+s.isEmpty());

        //capasicty of stack
        System.out.println("Capacity of Stack:- "+s.capacity());
    }
}
