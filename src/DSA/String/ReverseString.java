package DSA.String;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str="majjareharikumar";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        String re=str.chars()
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .reduce("",(a,b)->b+a);
        System.out.println(re);

        //SB
        String s= String.valueOf(new StringBuilder(str).reverse());
        System.out.println(s);

        //By using stack
        Stack sk=new Stack();
        String result="";
        for(int i=0;i<str.length();i++){
            sk.push(str.charAt(i));
        }
        while(!sk.isEmpty()){
            result+=sk.pop();
        }
        System.out.println(result);
    }
}
