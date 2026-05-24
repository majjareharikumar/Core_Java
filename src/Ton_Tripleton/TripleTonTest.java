package Ton_Tripleton;

import java.util.Random;

class TripleTon{
    private TripleTon(){}

    private static final TripleTon obj1=new TripleTon();
    private static final TripleTon obj2=new TripleTon();
    private static final TripleTon obj3=new TripleTon();

    private static final Random random=new Random();

    public static TripleTon getInstance(){
        int value = random.nextInt(3);

        if(value == 0) {
            return obj1;
        }
        else if(value == 1) {
            return obj2;
        }
        else {
            return obj3;
        }
    }
}

public class TripleTonTest {
    public static void main(String[] args) {
        TripleTon t1=TripleTon.getInstance();
        TripleTon t2=TripleTon.getInstance();
        TripleTon t3=TripleTon.getInstance();
        TripleTon t4=TripleTon.getInstance();
        TripleTon t5=TripleTon.getInstance();
        System.out.println("t1:-"+t1);
        System.out.println("t2:-"+t2);
        System.out.println("t3:-"+t3);
        System.out.println("t4:-"+t4);
        System.out.println("t5:-"+t5);

        System.out.println(t1==t2);
        System.out.println(t1==t3);
        System.out.println(t2==t1);
        System.out.println(t2==t3);
        System.out.println(t2==t4);
        System.out.println(t1==t4);
    }
}
