package Instagram.Basic;

public class Staticex {
    static int x=10;

    static {
        x=x+5;
    }
    public static void main(String[] args) {
        System.out.println(x);
    }
}
