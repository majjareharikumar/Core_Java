package collections.List;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,3,5,67,3,2,7,8,4);
        Set<Integer> set=new LinkedHashSet<>(list);
        list=new ArrayList<>(set);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("Second Highest number is :- "+list.get(list.size()-2));
    }
}
