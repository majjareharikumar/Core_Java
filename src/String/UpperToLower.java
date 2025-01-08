package String;

public class UpperToLower {
    public static void main(String[] args){
        String s="MAJJARE HARI KUMAR";
        //using string method
//        String re=s.toLowerCase();

        //using Ascii numbers
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if (c[i]>='A' & c[i]<='Z'){
                c[i]= (char) (c[i]+32);
            }
        }
        String re=new String(c);

        System.out.println(re);
    }
}
