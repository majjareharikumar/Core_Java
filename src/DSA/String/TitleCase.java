package DSA.String;

public class TitleCase {
    public static String titleCase(String s){
        char c=Character.toUpperCase(s.charAt(0));
        String s1=s.substring(1);
        return c+s1.toLowerCase()+" ";
    }
    public static void main(String[] args) {
        String str="majjare hari kumar";
        String[] s=str.split(" ");
        String result="";
        for(int i=0;i<s.length;i++){
            result+=titleCase(s[i]);
        }
        System.out.println(result.trim());
    }
}
