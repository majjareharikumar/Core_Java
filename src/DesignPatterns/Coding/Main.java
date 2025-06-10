package DesignPatterns.Coding;

//Singleton Design Pattern
//The Singleton Pattern ensures that only one instance of a class is created during the entire lifecycle of an application, and it provides a global point of access to that instance. It is commonly used for shared resources like configurations, loggers, database connections, etc.
//
//✅ Steps to Create a Singleton Class in Java
//-->Make the constructor private to prevent instantiation from other classes.
//-->Create a private static variable to hold the single instance of the class.
//-->Provide a public static method that returns the instance, creating it if necessary (lazy initialization).

class SingleTon{
    // Create a private static instance
    private static SingleTon instance;

    //private constructor
    private SingleTon(){
        System.out.println("singleton instance created");
    }

    //Public method to provide access to the instance

    public static SingleTon getInstance(){
        if(instance==null){
            instance=new SingleTon();
        }
        return instance;
    }

    public void showmessage(){
        System.out.println("Hello Singleton");
    }
}

public class Main {
    public static void main(String[] args) {
        SingleTon obj1=SingleTon.getInstance();
        SingleTon obj2=SingleTon.getInstance();
        obj1.showmessage();

        System.out.println(obj1==obj2);
    }


}
