package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Write a Java 8 program to find the longest string in a list of strings ?
public class LongestStringFinder {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Majjare","Hari","Nath","Kumar","Babu");

        Optional<String> longestStringFinder =words.stream().reduce((s1, s2)->s1.length()>s2.length()? s1:s1);

        longestStringFinder.ifPresent(s->System.out.println("Longest String in the List is :- "+s));
    }
}
