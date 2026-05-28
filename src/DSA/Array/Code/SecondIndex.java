package DSA.Array.Code;

import java.util.Scanner;

public class SecondIndex {
    public static void main(String[] args) {
        int[] arr={3,2,4,7,3,2,5,8,9,1,3,5,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int target=sc.nextInt();
        int count=0,index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
                if(count==2){
                    index=i;
                }
            }

        }
        if(index!=-1){
            System.out.println("Index of given number is:- "+index);
        }
        else {
            System.out.println("Second index is not available for given number");
        }
    }
}
