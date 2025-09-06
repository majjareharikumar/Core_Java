package DSA.String;

public class FindPattern {
    public static int findPattern(String s, String p){
        if(p.length()>s.length()) return -1;

        return s.indexOf(p);
    }

    public static void main(String[] args) {
        String s="hello";
        String p="ops";
        System.out.print(findPattern(s,p));
    }
}
