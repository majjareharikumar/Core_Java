package Ton_Multiton;

class Multiton{
    private Multiton(){}

    private static final int size=4;

    private static final Multiton[] objects=new Multiton[size];

    private static int count=0;

    static {
        for(int i=0;i<size;i++){
              objects[i]=new Multiton();
        }
    }

    public static Multiton getInstance(){
        Multiton obj=objects[count];
        count=(count+1)%4;
        return obj;
    }
}

public class MultitoTest {
    public static void main(String[] args) {
        Multiton obj1=Multiton.getInstance();
        Multiton obj2=Multiton.getInstance();
        Multiton obj3=Multiton.getInstance();
        Multiton obj4=Multiton.getInstance();
        Multiton obj5=Multiton.getInstance();
        Multiton obj6=Multiton.getInstance();

        System.out.println("obj1:-"+obj1);
        System.out.println("obj2:-"+obj2);
        System.out.println("obj3:-"+obj3);
        System.out.println("obj4:-"+obj4);
        System.out.println("obj5:-"+obj5);
        System.out.println("obj6:-"+obj6);
    }
}
