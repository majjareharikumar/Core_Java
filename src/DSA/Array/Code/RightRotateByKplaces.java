package DSA.Array.Code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotateByKplaces {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;

        //time O(n*k) & space O(1)
        while(k>0){

            int last=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
            k--;
        }
        System.out.println(Arrays.toString(arr));

        //Another way with time O(n) & space O(n)

        int n=arr.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
