package MultiThreading.code;

public class wait_notify {
    boolean flag=false;

    synchronized void printEven(int n) throws InterruptedException{
        while (flag) wait();;
        System.out.println("Even :- "+n);
        flag=true;
        notify();
    }

    synchronized void printOdd(int n) throws InterruptedException{
        while (!flag) wait();
        System.out.println("Odd:- "+n);
        flag=false;
        notify();
    }

    public static void main(String[] args) {
        wait_notify w= new wait_notify();

        Thread even=new Thread(()->{
            try {
                for (int i=0;i<=10;i+=2){
                    w.printEven(i);
                }
            }catch (InterruptedException e){}
        });

        Thread odd=new Thread(()->{
            try {
                for (int i=1;i<=9;i+=2){
                    w.printOdd(i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        even.start();odd.start();
    }
}
