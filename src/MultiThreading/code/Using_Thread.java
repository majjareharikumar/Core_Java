package MultiThreading.code;

public class Using_Thread extends Thread {
    public void run(){
        System.out.println("Thread started:- "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        Using_Thread t=new Using_Thread();
        t.start();
        t.run();
    }
}
