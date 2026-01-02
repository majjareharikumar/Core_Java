package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Checkifarrayissorted {
    public static boolean IsSorted(int[] a){
        int j=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>j){
                j=a[i];
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={10,13,12,30,40,50,60};
        System.out.print(IsSorted(arr)); //Out put:- false

        //java8
        boolean sorted= IntStream.range(0,arr.length-1)
                .allMatch(i->arr[i]<=arr[i+1]);
        System.out.println(sorted);
    }
}
