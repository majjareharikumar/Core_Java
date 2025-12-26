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
        String s="madam";
        System.out.println(isPalindrome(s));

        //Java8
        System.out.println("using java8");
        String result=s.chars()
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .map(String::toLowerCase)
                .reduce("",(a,b)->b+a);
        System.out.println(result);
        System.out.println(s.equals(result));
    }
}
