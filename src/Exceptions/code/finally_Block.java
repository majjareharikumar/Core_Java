package Exceptions.code;

public class finally_Block {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }
        catch (Exception e){
            System.out.println("Exception:- "+e.getMessage());
        }
        finally {
            System.out.println("Finally block will run always");
        }
    }
}
