package Interview.Corejava.code;

public class GarbageCollection {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before GC");
    }


    public static void main(String[] args) {
        GarbageCollection gc1=new GarbageCollection();
        GarbageCollection gc2=new GarbageCollection();
        GarbageCollection gc3=new GarbageCollection();

        gc1=null;
        gc2=gc3;

        System.gc();


    }
}
