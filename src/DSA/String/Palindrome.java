package DSA.String;

public class Palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();

        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String s="MadAm";
        System.out.print(isPalindrome(s));
    }
}
