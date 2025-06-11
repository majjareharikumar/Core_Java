package Exceptions.code;

public class Multiple_Catch_Blocks {
    public static void main(String[] args) {
        try{
            //int i=4/0;
            int a[]=new int[3];
            System.out.println(a[10]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException:- "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException:- "+e.getMessage());
            //e.printStackTrace();
        }
    }
}
