package MultiThreading.code;

class count{
    int c=0;

    public synchronized void increment(){
        c++;
    }
}

public class SynchronizedEx {
    public static void main(String[] args) throws InterruptedException {
        count c=new count();
        Thread t1=new Thread(()->{for(int i=0;i<100;i++)c.increment();});
        Thread t2=new Thread(()->{for(int i=0;i<100;i++)c.increment();});
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("Final count:- "+c.c);
    }
}
