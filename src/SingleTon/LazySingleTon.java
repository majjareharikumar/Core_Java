package SingleTon;
//Lazy Initialization Singleton
public class LazySingleTon {

    private LazySingleTon(){
        System.out.println("SingleTon instance created");
    }

    private static LazySingleTon instance;

    public static LazySingleTon getInstance(){

        if(instance==null){
            instance=new LazySingleTon();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleTon obj1= LazySingleTon.getInstance();
        LazySingleTon obj2= LazySingleTon.getInstance();

        System.out.println("Is obj1 and obj2 same?:- "+(obj1==obj2));
    }

}
