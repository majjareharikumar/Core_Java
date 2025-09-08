package DSA.Array.Code;

import java.util.Arrays;

public class reverseArray {
    public static int[] reverse(int[] arr){
       // int[] arr1=new int[arr.length];
        int i=0,j=arr.length-1,temp;
        while(j>=i){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        int[] result=reverse(a);

        System.out.println(Arrays.toString(result));
    }
}
