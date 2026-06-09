package DesignPatterns.BasicDesignPatterns.Code;

public class SingleTon {
    private SingleTon(){}

    private static SingleTon instance;

    public static SingleTon getInstance(){
        if(instance==null){
            instance=new SingleTon();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTon obj1=SingleTon.getInstance();
        SingleTon obj2=SingleTon.getInstance();

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1==obj2);
    }
}
