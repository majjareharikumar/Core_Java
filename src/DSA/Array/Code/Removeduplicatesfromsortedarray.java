package DSA.Array.Code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Removeduplicatesfromsortedarray {
    public static int unique(int[] arr){
//        Set<Integer> set=new HashSet<>();
//        for(int a:arr){
//            set.add(a);
//        }
//        for(int i:set){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        return set.size();

         arr=Arrays.stream(arr).distinct().toArray();
         return arr.length;
    }

    public static void main(String[] args) {
        int[] arr={-2, 2, 4, 4, 4, 4, 5, 5};
        System.out.print(unique(arr));
    }
}
