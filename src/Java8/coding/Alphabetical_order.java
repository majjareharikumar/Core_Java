package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java 8 program to sort a list of strings in alphabetical order
public class Alphabetical_order {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("Hari","Ram","Mani","Hani","Ammu","Rani");
        List<String> names=words.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Strings:- "+names);
    }
}
