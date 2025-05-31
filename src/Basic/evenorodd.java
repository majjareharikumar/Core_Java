package Basic;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int i=scanner.nextInt();
        if(i%2==0){
            System.out.println(i+ " Is Even Number");
        }
        else {System.out.println(i+ " Is Odd Number");}
    }
}

//Logic Explanation:
//What is an even number?
//A number is even if it is divisible by 2 (i.e., remainder is 0).
//Example: 4 % 2 = 0, so 4 is even.
//What is an odd number?
//A number is odd if it is not divisible by 2 (i.e., remainder is 1).
//Example: 5 % 2 = 1, so 5 is odd.
//How to check this in Java?
//Use the modulus operator % to get the remainder.
//If number % 2 == 0, it's even; else it's odd.
