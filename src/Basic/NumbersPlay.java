package Basic;

import java.util.Scanner;

public class NumbersPlay {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int i= sc.nextInt(), j=sc.nextInt();
        //add
        int sum=i+j;
        System.out.println("Sum of "+ i +" & "+ j+ " = "+sum);

        //sub
        int sub=i-j;
        System.out.println("Sub of "+ i +" & "+ j+ " = "+sub);

        //mul
        int mul=i*j;
        System.out.println("Mul of "+ i +" & "+ j+ " = "+mul);

        //Div
        int div=i/j;
        System.out.println("Div of "+ i +" & "+ j+ " = "+div);
    }

}
