package collections.List.Code;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,5,3,6,7,4,8,9);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);

        //Java8
        List<Integer> ascending=list.stream()
                .sorted().toList();
        System.out.println(ascending);

        List<Integer> descending=list.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(descending);
    }
}
