package DSA.String;

public class Palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
//        String s1="";
//        int i=s.length()-1;
//        while (i>=0){
//            s1+=s.charAt(i);
//            i--;
//        }
//        System.out.println(s1);
//        return s.equals(s1);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String s="MadAm";
        System.out.print(isPalindrome(s));
    }
}
