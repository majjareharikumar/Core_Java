package String;

public class LowerToUpper {
    public static void main(String[] args){
        String s="majjare hari kumar";
        char[] c=s.toCharArray();

        //Using ASCII Arithmetic
//        for(int k=0;k<c.length;k++){
//            if(c[k]>='a' & c[k]<='z'){
//                c[k]= (char) (c[k]-32);
//            }
//        }

        String reulst=new String(c);

        //using string method
        String re=s.toUpperCase();
        System.out.println(re);
    }
}
