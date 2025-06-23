package Java8.coding;

import java.util.List;
import java.util.Optional;

//Write a Java 8 program to find the last element in a list ?
public class LastElement {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7);

        Optional<Integer> last=list.stream().reduce((f,s)->s);
        last.ifPresent(s->System.out.println("Last element of the list is :- "+s));
    }
}
