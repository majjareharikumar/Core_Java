package collections.Queue;

//Common Methods from Queue Interface
//Method	Description
//add(e)	Adds element, throws exception if failed
//offer(e)	Adds element, returns false if failed
//peek()	Returns head without removing, null if empty
//poll()	Removes and returns head, null if empty
//remove()	Removes head, throws exception if empty
//element()	Returns head, throws exception if empty
//isEmpty()	Checks if the queue is empty
//size()	Returns current size of the queue
//clear()	Removes all elements
//contains(e)	Checks if element exists

import java.util.ArrayDeque;
import java.util.Queue;

public class Arraydeque {

    public static void main(String[] args) {
        Queue<Integer> aq = new ArrayDeque<>();

        //add elements to Q
        aq.add(1);
        aq.add(2);
        aq.add(3);
        aq.add(4);
        aq.add(5);

        System.out.println("Original ArrayQueue:- "+aq);

        //get the value without removing
        System.out.println("Head value:- "+aq.peek());

        //get the value by removing
        System.out.println("Head value that removing:- "+aq.poll());

        //remove the head
        System.out.println("before removing head:- "+aq);
        aq.remove();
        System.out.println("After removing head:- "+aq);

        //size of Queue
        System.out.println("Size of Queue:- "+aq.size());

        //Contains element
        System.out.println("Is Queue contains 1 :- "+aq.contains(1));

        //clear Queue
        System.out.println("Before clearing the queue , Is empty? :- "+aq.isEmpty());

        aq.clear();

        System.out.println("After clearing the queue , Is empty? :- "+aq.isEmpty());
    }

}
