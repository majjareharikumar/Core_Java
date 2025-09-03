package DSA.Array.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class evenOdd {
    public static int[] EvenOdd(int[] arr){
//        int[] arr1=new int[arr.length];
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                arr1[j++]=arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2!=0)
//            {
//                arr1[j++]=arr[i];
//            }
//        }
//        return arr1;

        // Java 8
        return IntStream.concat(Arrays.stream(arr).filter(n->n%2==0),Arrays.stream(arr).filter(n->n%2!=0)).toArray();
    }

    public static void main(String[] args) {
        int[] a={54, 43, 2, 5, 14, 17, 18, 19};
        int[] result=EvenOdd(a);
        System.out.print(Arrays.toString(result));
    }
}
