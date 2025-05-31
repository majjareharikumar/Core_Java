package AllConcepts;

public class Occurence {
    public static void occu(String m, char c) {
        String s=m.toLowerCase();
        char ch[]=s.toCharArray();
        int i=0;
        for(int p=0;p<ch.length;p++){
            if (ch[p]==c){
                i++;
            }
        }

        System.out.println("Occurence of "+c+ "="+i);
    }

    public static void main(String[] args){
        String s="majjareharikumar";
        occu(s,'h');
    }
}
