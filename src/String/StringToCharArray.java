package String;

public class StringToCharArray {
    public static void main(String[] args){
        String s="Majjare Hari Kumar";
        char[] c=s.toCharArray();

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
