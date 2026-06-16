package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArray {


    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};

        //way1
        int[] k=new int[a.length];
        int index=0;
        for(int l=a.length-1;l>=0;l--){
            k[index++]=a[l];
        }
        System.out.println(Arrays.toString(k));
        System.out.println();
        //way2
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));

    }
}
