package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerostoEnd {
    public static int[] zerostoend(int[] arr){
//        int[] arr1=new int[arr.length];
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                arr1[j]=arr[i];
//                j++;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                arr1[j]=arr[i];
//                j++;
//            }
//
//        }
//        return arr1;

        return IntStream.concat(Arrays.stream(arr).filter(i->i!=0),Arrays.stream(arr).filter(i->i==0)).toArray();
    }

    public static void main(String[] args) {
        int[] arr={0, 1, 0,4,0, 0, 5,0, 2,0};
        int[] result=zerostoend(arr);
        for(int a: result){
            System.out.print(a+" ");
        }
    }
}
