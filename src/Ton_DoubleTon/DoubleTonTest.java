package Ton_DoubleTon;

import java.util.Random;

class DoubleTon{
    private DoubleTon(){}

    private static DoubleTon instance1=new DoubleTon();
    private static DoubleTon instance2=new DoubleTon();

    private static final Random random=new Random();

    public static DoubleTon getInstance(){

        if(random.nextBoolean()){
            return instance1;
        }else {
            return instance2;
        }

    }
}
public class DoubleTonTest {
    public static void main(String[] args) {
        DoubleTon t1=DoubleTon.getInstance();
        DoubleTon t2=DoubleTon.getInstance();
        DoubleTon t3=DoubleTon.getInstance();
        DoubleTon t4=DoubleTon.getInstance();


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t1==t2);
    }
}
