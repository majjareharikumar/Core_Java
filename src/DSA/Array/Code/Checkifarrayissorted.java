package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Checkifarrayissorted {
    public static boolean IsSorted(int[] a){
        int j=Integer.MIN_VALUE;
        for(int n:a){
            if(n>j){
                j=n;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={10,12,13,30,40,50,60};
        System.out.println(IsSorted(arr)); //Out put:- false

        //java8
        boolean sorted= IntStream.range(0,arr.length-1)
                .allMatch(i->arr[i]<=arr[i+1]);
        System.out.println(sorted);
    }
}
