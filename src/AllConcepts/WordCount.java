package AllConcepts;

public class WordCount {
    public static void main(String[] args){
        String s="Hello World";
       // char ch[]=s.toCharArray();
        String[] s1=s.trim().split(" ");

        int c=0;
        boolean isWord=false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=' '){
                if(!isWord){
                    c++;
                    isWord=true;

                }
                else {
                    isWord=false;
                }

            }
        }

        System.out.println(s+ " have "+s1.length+ " words");
    }
}
