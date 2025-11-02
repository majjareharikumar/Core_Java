package DSA.Code_IMPL;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        //Insert elements to list
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        //fetch all elements
        System.out.println("Elements in Array List:- "+ al);
        al.add(1,15);
        System.out.println("Elements in Array List After adding new element at index 1:- "+al);

        //Search element
        System.out.println("Is elements 20 present:- "+al.contains(20));

        //Get element
        System.out.println("Element at index 2:- "+al.get(2));

        //Delete element at index
        al.remove(1);
        System.out.println("Array List after deleting element at 1:- "+al);

        //Delete element
        al.remove(Integer.valueOf(20));
        System.out.println("Array List after deleting 20:- "+al);

    }
}
