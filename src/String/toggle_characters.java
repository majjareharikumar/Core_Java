package String;

public class toggle_characters {
    public static void main(String[] args){
        String s="maJJarEHarIKuMaR";
        char[] c=s.toCharArray();
        for (int i=0;i<c.length;i++){
            if(c[i]>='a' & c[i]<='z'){
                c[i]= (char) (c[i]-32);
            }else{
                c[i]= (char) (c[i]+32);
            }
        }

        String re=new String(c);
        System.out.println("Original String :-"+s);
        System.out.println("Toggle String :-"+re);
    }
}
