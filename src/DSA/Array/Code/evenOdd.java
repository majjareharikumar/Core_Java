package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class evenOdd {
    public static void EvenOdd(int[] arr){
        Arrays.sort(arr);
        int[] arr1=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0)
            {
                arr1[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));

        // Java 8
       int[] a= IntStream.concat(Arrays.stream(arr).filter(n->n%2==0),Arrays.stream(arr).filter(n->n%2!=0)).toArray();
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a={54, 43, 2, 5, 14, 17, 18, 19};
       EvenOdd(a);

    }
}
