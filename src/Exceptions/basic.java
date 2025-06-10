package Exceptions;

public class basic {
    public static void main(String[] args) {
        int a=20,b=2,c=0;
        int d=a/b;
        int e=0; //ArithmeticException: / by zero is not possible.

        try{
            System.out.println("try Start");
            e=a/c;
        }
        catch (ArithmeticException A){
            System.out.println("Divided by zero is not possible");
            System.out.println("By default denominator value is set 1");
            e=a/1;
        }
        System.out.println(d);
        System.out.println(e);
    }
}
