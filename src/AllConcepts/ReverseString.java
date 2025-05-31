package AllConcepts;

public class ReverseString {
    public static void main(String[] args){
        String s="Majjare";
        char c[]=s.toCharArray();
        String r="";

        for(int i=c.length-1;i>=0;i--){
            r+=c[i];
        }
        System.out.println(r);

        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());

        StringBuilder SB= new StringBuilder(s);
        System.out.println(SB.reverse());
    }
}
