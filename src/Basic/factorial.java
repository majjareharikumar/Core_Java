package Basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr no");
        int i=sc.nextInt(),f=1;

        for(int j=1;j<=i;j++){
            f=f*j;
        }
        System.out.println("factorial of "+i+" = "+f);
    }
}
