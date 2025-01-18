package Basic;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int i=sc.nextInt(),j=sc.nextInt(),k=sc.nextInt();
//        if(i>j & i>k){System.out.println(i + " is big number");}
//        else if (j>i & j>k) {System.out.println(j+" is big number");}
//        else{System.out.println(k+ " is big number");}
        int t,m;
        t=i>j?i:j;
        m=t>k?j:k;
        System.out.println(m+" is big number");
    }
}
