package SingleTon;

public class BillPushSingleTon {
    private BillPushSingleTon(){
        System.out.println("Singleton instance created");
    }
    public static class Helper{
        private static final BillPushSingleTon INSTANCE=new BillPushSingleTon();

    }
    public static BillPushSingleTon getInstance(){
        return Helper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPushSingleTon obj1=BillPushSingleTon.getInstance();
        BillPushSingleTon obj2=BillPushSingleTon.getInstance();
        System.out.println("Is obj1 and obj2 same?:- "+(obj1==obj2));
    }
}
