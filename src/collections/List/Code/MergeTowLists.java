package collections.List.Code;

import java.util.*;

public class MergeTowLists {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2=new ArrayList<>(Arrays.asList(4,5,6,7,8));

        List<Integer> merged1=new ArrayList<>();
        merged1.addAll(list1);
        merged1.addAll(list2);
        System.out.println("List with duplicates:- "+merged1);

        Set<Integer> merged2=new LinkedHashSet<>();
        merged2.addAll(list1);
        merged2.addAll(list2);
        System.out.println("List with out duplicates:- "+merged2);
    }
}
