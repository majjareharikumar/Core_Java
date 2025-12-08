package DSA.String;

public class ReverseString {
    public static String rverse(String s){
       // s.toLowerCase();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }

        return s1;
    }

    public static void main(String[] args) {
        String s="Majjare";
        System.out.println(rverse(s));
    }
}
