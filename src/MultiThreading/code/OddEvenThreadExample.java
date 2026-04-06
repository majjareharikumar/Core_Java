package MultiThreading.code;

class NumberPrint{
    private int count=1;
    private final int max=10;

    public synchronized void oddNumbers(){
        while(count<=max){
            if(count%2==0){
               try{
                   wait();
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
            }
            else{
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

    public synchronized void evenNumbers(){
        while (count<=max){
            if(count%2!=0){
                try{
                    wait();;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            else{
                System.out.println(count);
                count++;
                notify();
            }
        }
    }
}
public class OddEvenThreadExample {

    public static void main(String[] args) {
        NumberPrint p=new NumberPrint();

        Thread odd= new Thread(()->p.oddNumbers());
        Thread even =new Thread(()->p.evenNumbers());
        odd.start();
        even.start();

    }
}
