package DSA.String;

public class Palindrome {
    public static boolean isPalindrome(String s){
       s= s.toLowerCase();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }

        return s.equals(s1);
    }

    public static void main(String[] args) {
        String s="MadAm";
        System.out.print(isPalindrome(s));
    }
}
