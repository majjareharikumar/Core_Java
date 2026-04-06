package MultiThreading.code;

import java.util.LinkedList;
import java.util.Queue;

class PC{
    private Queue<Integer> queue=new LinkedList<>();
    private final int capacity=5;

    public synchronized void producer(int value) throws InterruptedException{
        while (queue.size()==capacity){
            wait();
        }
        queue.add(value);
        System.out.println("Priducers:- "+value);
        notifyAll();
    }

    public synchronized void consumer() throws InterruptedException{
        while(queue.isEmpty()){
            wait();
        }
        int i=queue.poll();
        System.out.println("Consumer:- "+i);
        notifyAll();
    }
}
public class ProducerConsumerExample {
    public static void main(String[] args) {

        PC pc=new PC();
        new Thread(
                ()->{
                    for(int i=1;i<=10;i++){
                        try{
                            pc.producer(i);
                        }catch (Exception e){};
                    }
                }
        ).start();

        new Thread(
                ()->{
                    for(int i=1;i<=10;i++){
                        try{
                            pc.consumer();
                        }catch (Exception e){};
                    }
                }
        ).start();
    }
}
