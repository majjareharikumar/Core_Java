package DSA.Array.Code;

import java.util.*;

public class SecondLargest {
    public static int secondLarge(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int n: arr){
            if(n>largest){
                third=second;
                second=largest;
                largest=n;
            }
            else if(n>second && n!=largest){
                third=second;
                second=n;
            } else if (n>third && n!=second && n!=largest) {
                third=n;

            }
        }

        return third;
    }

    public static void main(String[] args) {
        int[] a={2,2,2,2,1,4};
        System.out.print(secondLarge(a));
    }
}
