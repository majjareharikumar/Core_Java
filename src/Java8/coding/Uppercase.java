package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Write a Java 8 program to convert all strings to uppercase in a list ?
public class Uppercase {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("majjare","hari","nath","kumar","babu");

        List<String> name=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase of names in the List:- "+name);

        //names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
