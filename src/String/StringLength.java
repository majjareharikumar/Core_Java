package String;

public class StringLength {
    public static void main(String[] args){
        String s="Majjare Hari Kumar";
        char[] c=s.toCharArray();
        int i=0;
        for(char ch:c){
            i++;
        }

        System.out.println("Length of the String is :-"+i);

        System.out.println("Length :- "+s.length());
    }
}
