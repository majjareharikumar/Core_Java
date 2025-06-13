package Java8.coding;

//1. Write a Java 8 program to count the number of strings starting with a specific letter in a list.


import java.util.Arrays;
import java.util.List;

public class CountStrings {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Hari","Hani","Harsh","Mani");

        Long count=names.stream()
                .filter(name->name.startsWith("H"))
                .count();
        System.out.println("Count of H words:- "+count);
    }
}
