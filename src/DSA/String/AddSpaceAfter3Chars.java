package DSA.String;

import java.util.stream.IntStream;

public class AddSpaceAfter3Chars {
    public static void main(String[] args) {
        String str="abcdefghijklmnop";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            result.append(str.charAt(i));
            if((i+1)%3==0 && (i+1)!=str.length()){
                result.append(" ");
            }
        }
        System.out.println(result);

        //java8
        String re= IntStream.range(0,str.length())
                .mapToObj(i->{
                    if((i+1)%3==0 && (i+1)!=str.length()){
                        return str.charAt(i)+" ";
                    }
                    return String.valueOf(str.charAt(i));
                })
                .reduce("",String::concat);
        System.out.println(re);
    }
}
