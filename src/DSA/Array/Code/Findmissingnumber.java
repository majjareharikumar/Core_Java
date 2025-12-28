package DSA.Array.Code;

import java.util.stream.IntStream;

public class Findmissingnumber {

    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int n=arr.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;

        for(int num:arr){
            actualSum+=num;
        }
        int missng=expectedSum-actualSum;
        System.out.println("Missing Number:- "+missng);

        //java8
        int expected = IntStream.rangeClosed(1,n).sum();
        int actual=IntStream.of(arr).sum();
        System.out.println(expected-actual);

        //OR

        int s=arr[0];
        int e=arr[arr.length-1];

        int expect=IntStream.rangeClosed(s,e).sum();
        int actual1=IntStream.of(arr).sum();
        System.out.println(expect-actual1);

    }
}
