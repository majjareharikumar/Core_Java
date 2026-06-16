package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr={0, 1, 0,4,0, 0, 5,0, 2,0};

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));

        //java8
        int[] arr2=IntStream.concat(Arrays.stream(arr).filter(n->n!=0),Arrays.stream(arr).filter(n->n==0)).toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
