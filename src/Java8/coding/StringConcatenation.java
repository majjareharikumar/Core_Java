package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to concatenate all strings in a list ?
public class StringConcatenation {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Majjare","Hari","Kumar");

        String result=words.stream().reduce("",(s1,s2)->s1+s2);

        System.out.println("Concatenated String:- "+result);
    }
}
