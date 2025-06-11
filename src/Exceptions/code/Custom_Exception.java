package Exceptions.code;

import java.util.Scanner;

class InvaliAgeException extends RuntimeException{
    public InvaliAgeException(String message){
        super(message);
    }
}

public class Custom_Exception {

    public static void checkAge(int a) throws InvaliAgeException{
        if (a<18){
            throw new InvaliAgeException("Age must be 18 years");
        }
        else {
            System.out.println("valid age for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter Age");
        int i=sn.nextInt();
        try{
            checkAge(i);
        }
        catch (InvaliAgeException e){
            System.out.println("Custom Exception Caught: "+e.getMessage());
        }
    }

}
