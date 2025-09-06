package DSA.String;

public class SliceTheString {
    public static String slice(String s){
        String s1="";
        if(s.length()<3){
            return "";
        }
        else{
            for(int i=1;i<s.length()-1;i++){
                s1+=s.charAt(i);
            }
        }
        return s1;
    }

    public static void main(String[] args) {
        String s="Majjare";
        System.out.print(slice(s));
    }
}
