package DSA.Array.Code;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 6, 7, 4, 3};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        System.out.println("Second largest number:- " + second);

        //Java8

        int secondLarge = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(Arrays.stream(arr).distinct().count() - 2)
                .findFirst()
                .orElseThrow();
        System.out.println(secondLarge);
    }
}
