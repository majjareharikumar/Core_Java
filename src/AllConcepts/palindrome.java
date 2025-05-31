package AllConcepts;

public class palindrome {
    public static void pali(String s){
        char c[]=s.toCharArray();
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=c[i];
        }
        if(s.equals(s1)){
            System.out.println("Given string is palindrome");
        }else {System.out.println("Given string is not palindrome");}
    }

    public static void main(String[] args){
        String s="MARKRAM";
        pali(s);
    }
}
