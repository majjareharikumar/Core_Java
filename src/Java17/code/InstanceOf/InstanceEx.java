package Java17.code.InstanceOf;

public class InstanceEx {
    public static void main(String[] args) {
        Object obj="Hello";

        //Before Java17
        if(obj instanceof String){
            String s=(String)obj;
            System.out.println(s.toUpperCase());
        }

        //Java17
        if(obj instanceof String str){
            System.out.println(str.toUpperCase());
        }
    }
}
