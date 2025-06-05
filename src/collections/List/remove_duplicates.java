package collections.List;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove_duplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,3,2,4,5,3,6,1);
        System.out.println("Before removing the duplicates:- "+list);

        Set<Integer> set=new LinkedHashSet<>(list);
        System.out.println("After removing the duplicates:- "+set);
    }
}
