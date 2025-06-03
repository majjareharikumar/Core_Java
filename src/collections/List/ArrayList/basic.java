package collections.List.ArrayList;

//Summary of Methods Used:
//        Method	   -->     Purpose
//        add(value)  -->	Adds element to end
//        add(index, value)-->	Adds element at specific index
//        get(index)	-->Gets element at index
//        set(index, value)-->	Replaces element at index
//        remove(value)-->	Removes first occurrence of value
//        remove(index)-->	Removes element at index
//        contains(value)-->	Checks if list contains value
//        size()	-->Returns number of elements
//        isEmpty()-->	Checks if list is empty
//        clear()-->	Removes all elements


import java.util.ArrayList;
import java.util.List;

//Basic ArrayList Program with All Key Operations
public class basic {
    public static void main(String[] args) {
        //Creation of ArrayList
        ArrayList<String> al=new ArrayList<>();

        //add values to arrayList
        al.add("Majjare");
        al.add("Hari");
        al.add("Kumar");
        //Printing the list

        System.out.println("Original list:-"+al);

        //Add element at a specific index
        al.add(2,"Nath");
        System.out.println("List after adding the name at index 2:"+al);

        //get the name at specific index
        System.out.println("Name at index 3:-"+al.get(3));

        //Replace an element
        al.set(1,"Hani");
        System.out.println("List after replacing Hari with Hani:- "+al);

        //Remove an element by value
        al.remove("Kumar");
        System.out.println("List after removing the Kumar:- "+al);

        //Remove an element by index
        al.remove(0);
        System.out.println("List after removing the index 0:- "+al);

        // Check if list contains an element
        System.out.println("List contains Hani:-"+al.contains("Hani"));

        //Get size of the list
        System.out.println("Size of list is:-"+al.size());

        //Check is lis is empty
        System.out.println("Is List empty?:-"+al.isEmpty());

        //Loop through the list using for-each
        System.out.println("For Each loop");
        for(String name:al){
            System.out.print(name+",");
        }

        //Loop using traditional for loop
        System.out.println("Looping using index:");
        for(int i=0;i<al.size();i++){
            System.out.println("List at index "+i+" : "+al.get(i));
        }

        //Clear all elements
        al.clear();
        System.out.println("List after clearing the lis:- "+al);
        System.out.println("Is List empty?:-"+al.isEmpty());
    }
}
