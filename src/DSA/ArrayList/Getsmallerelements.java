package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Getsmallerelements {
    public static ArrayList<Integer> smaller(int[] arr,int t){
        return new ArrayList<>(Arrays.stream(arr).boxed().filter(i->i<t).toList());
    }

    public static void main(String[] args) {
        int[] arr={54, 43, 2, 1, 5};
        int t=7;
        System.out.println(smaller(arr,t));
    }
}
