package SingleTon;
//Early Initialization Singleton
public class EarlySingleTon {
    private EarlySingleTon(){
        System.out.println("Singleton instance created");
    }

    private static final EarlySingleTon INSTANCE = new EarlySingleTon();
    public static EarlySingleTon getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
     EarlySingleTon obj1=EarlySingleTon.getInstance();
     EarlySingleTon obj2=EarlySingleTon.getInstance();
     System.out.println("Is obj1 and obj2 same?:- "+(obj1==obj2));
    }
}
