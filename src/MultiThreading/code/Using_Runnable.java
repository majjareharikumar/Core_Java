package MultiThreading.code;

public class Using_Runnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:- "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Using_Runnable());
        t.start();
        //t.start();
    }
}
