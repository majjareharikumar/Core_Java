package collections.List.Code;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,3,4,2,5,6,7,5,6,7,8,9);

        //way 1
        Set<Integer> set=new LinkedHashSet<>(list);
        System.out.println(set);

        //way 2
        List<Integer> arrayList=new ArrayList<>();
        for(Integer i: list){
            if(!arrayList.contains(i)){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);

        //way 3
        List<Integer> result=list.stream()
                .distinct().toList();

        System.out.println(result);
    }
}
