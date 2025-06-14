package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to count the occurrences of a given character in a list of strings?
public class CharacterCount {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Majjare","Hari","Nath","Kumar","Babu");

        char targetChar='a';

        long count=list.stream().flatMapToInt(String::chars).mapToObj(c->(char)c).filter(ch->ch==targetChar || ch==Character.toLowerCase(targetChar)).count();

        System.out.println("Target Character a count:- "+count);
    }
}
