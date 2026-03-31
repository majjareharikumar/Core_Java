package DSA.Array.Code;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MergeAndSort {
    public static void main(String[] args) {
        int[] arr1={2,5,1,6,9,7};
        int[] arr2={3,7,4,8,10};
        int[] result=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            result[arr1.length+i]=arr2[i];
        }
        Arrays.sort(result);
        for(int n:result){
            System.out.print(n+" ");
        }

        System.out.println();

        //Java 8
        System.out.println("Java 8");
         IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                 .distinct()
                .sorted()
                .forEach(e->System.out.print(e+" "));

    }
}
