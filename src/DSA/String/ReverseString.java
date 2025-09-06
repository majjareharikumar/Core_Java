package DSA.String;

public class ReverseString {
    public static String rverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s="Majjare";
        System.out.println(rverse(s));
    }
}
