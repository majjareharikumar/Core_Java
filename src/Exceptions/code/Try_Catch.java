package Exceptions.code;

public class Try_Catch {
    public static void main(String[] args) {
       try{
           int i=2/0;
       }
       catch (ArithmeticException e){
           System.out.println("Devide by zero is not possible:- "+e.getMessage());
       }
    }
}
