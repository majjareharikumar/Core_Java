package AllConcepts;

interface FC{
    void m();
    default void m1(){
        System.out.println("Default method in FI");
    }
}

class myclass implements FC{

    @Override
    public void m() {
        System.out.println("abstract method in my class");
    }

    @Override
    public void m1() {
        System.out.println("default method in mt class");
    }
}
public class FunctionalInterface {

    public static void main(String[] args){
        FC f=new myclass();
        f.m();
        f.m1();
    }
}
