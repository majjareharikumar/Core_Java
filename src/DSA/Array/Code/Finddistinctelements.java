package DSA.Array.Code;

import java.util.Arrays;

public class Finddistinctelements {
    public static long distinct(int[][] arr){
        return Arrays.stream(arr).distinct().count();
    }

    public static void main(String[] args) {
        int[][]matrix={
                {2, 1, 4, 3} ,
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}
        };
        System.out.print(distinct(matrix));
    }
}
