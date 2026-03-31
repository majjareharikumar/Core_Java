package DSA.Array.Code;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MergeUniqueSort {
    public static void main(String[] args) {
        int[] arr1={2,5,6,9,3,7,0};
        int[] arr2={1,3,4,8,7,10};

        Set<Integer> set= new LinkedHashSet<>();
        for(int n:arr1){
            set.add(n);
        }
        for(int n:arr2){
            set.add(n);
        }
        int[] result=new int[set.size()];
        int i=0;
        for(int n: set){
            result[i++]=n;
        }

        Arrays.sort(result);
        for(int r:result){
            System.out.print(r+" ");
        }
        System.out.println();

        //Java 8
        System.out.println("Java 8 ");
        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .distinct()
                .sorted()
                .forEach(e-> System.out.print(e+" "));

    }
}
