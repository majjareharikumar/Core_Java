package DSA.String;

public class ChangeCase {
    public static void changeCase(String s){
        String s1=s.substring(0,1).toUpperCase()+s.substring(1);
        String s2=s.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        String s="majjare";
        changeCase(s);
    }
}
