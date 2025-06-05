package collections.List;

import java.util.*;

public class merge_two_Lists_without_duplicates {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4);
        List<Integer> list2=Arrays.asList(2,4,6,7,8,9);
        List<Integer> list3=new ArrayList<>();

        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("List with Duplicate:- "+list3);

        Set<Integer> mergerd=new LinkedHashSet<>();
        mergerd.addAll(list1); mergerd.addAll(list2);
        System.out.println("List with out Duplicates:- "+mergerd);
    }
}
