package DSA.Array.Code;

import java.util.Arrays;

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
        int[] arr={10,20,12,30,40,50,60};
        System.out.print(IsSorted(arr));
    }
}
