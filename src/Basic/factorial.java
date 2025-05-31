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

//Logic to Find Factorial in Java
//-->Take an input number n from the user.
//-->Initialize a variable fact = 1 to hold the result.
//-->Use a loop (like for) to multiply fact with every number from 1 to n.
//-->After the loop ends, fact will have the factorial value.

