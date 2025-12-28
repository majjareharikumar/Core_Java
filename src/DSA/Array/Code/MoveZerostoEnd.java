package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr={0, 1, 0,4,0, 0, 5,0, 2,0};
        int[] arr1=new int[arr.length];
        int index=0;
        for(int n:arr){
            if(n!=0){
                arr1[index++]=n;
            }
        }
        for(int n:arr){
            if(n==0){
                arr1[index++]=n;
            }
        }
        System.out.println(Arrays.toString(arr1));

        //java8
        int[] arr2=IntStream.concat(Arrays.stream(arr).filter(n->n!=0),Arrays.stream(arr).filter(n->n==0)).toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
