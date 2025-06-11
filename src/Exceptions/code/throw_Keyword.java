package Exceptions.code;

import java.util.Scanner;

public class throw_Keyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age<18){
            throw new ArrayIndexOutOfBoundsException("Age must be 18 or above");
        }
        else {
            System.out.println("Valid age for vote");
        }
    }
}
