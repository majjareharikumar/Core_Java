package DSA.Array.Code;

import java.util.*;

public class SecondLargest {
    public static int secondLarge(int[] arr){
//        Set<Integer> set=new HashSet<>();
//        int n=set.size();
//        for(int a:arr){
//            set.add(a);
//        }
//        List<Integer> list=new ArrayList<>(set);
//
//        if(list.size()<2) return -1;
//
//        else return list.get(list.size()-2);

        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst().get();
    }

    public static void main(String[] args) {
        int[] a={2,2,2,2,1,4};
        System.out.print(secondLarge(a));
    }
}
