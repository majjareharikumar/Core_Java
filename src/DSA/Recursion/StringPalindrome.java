package DSA.Recursion;

public class StringPalindrome {

    public static boolean isPalindrome(String str, int s, int e){
        if(s>=e){return true;}
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        return isPalindrome(str,s+1,e-1);
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str,0,str.length()-1));

    }
}
