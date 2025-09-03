package DSA.Array.Code;

import java.util.Arrays;

public class LargestElement {
    public static int largeElement(int[] arr){
       /* int j=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>j){
                j=arr[i];
            }
        }*/

        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr={2,4,5,12,5,67,89,90};
        System.out.print(largeElement(arr));
    }
}
