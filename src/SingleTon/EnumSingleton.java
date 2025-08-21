package SingleTon;

public enum EnumSingleton {
    INSTANCE;
}

class EnumSingletonClient {
    public static void main(String[] args) {
        EnumSingleton obj1=EnumSingleton.INSTANCE;
        EnumSingleton obj2=EnumSingleton.INSTANCE;
        System.out.println("Is obj1 and obj2 same?:- "+(obj1==obj2));
    }
}
