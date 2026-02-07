package collections.List.Code;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,4,2,6,5,8,9,7,10,12,3,4,6,1,2,8,12));
        Set<Integer> set=new LinkedHashSet<>(list);
        List<Integer> list1=new ArrayList<>(set);

        //Ascending order
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list1.get(list1.size()-2));

        //Descending order
        Collections.sort(list1,Comparator.reverseOrder());
        System.out.println(list1);
        System.out.println(list1.get(1));

        //Java8
        Optional<Integer> second=list1.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                ;
        System.out.println(second);

        Integer second1=list.stream()
                .distinct()
                .sorted()
                .skip(list.stream().distinct().toList().size()-2)
                .findFirst()
                .orElseThrow();
        System.out.println(second);


    }
}
