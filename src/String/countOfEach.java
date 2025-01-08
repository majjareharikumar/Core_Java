package String;

import java.util.Scanner;

public class countOfEach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String S=sc.next();
        char[] C=S.toCharArray();
        int v=0,c=0,d=0,s=0,sp=0;
        for(int i=0;i<C.length;i++){
            if(C[i]=='a' || C[i]=='e' || C[i]=='i' || C[i]=='o' || C[i]=='u' || C[i]=='A' || C[i]=='E' || C[i]=='I' || C[i]=='O' || C[i]=='U'){
                v++;
            }else if(C[i]>='a' && C[i]<='z' || C[i]>='a' && C[i]<='z'){
             c++;
            }else if(C[i]>='9' && C[i]<='9'){
                d++;
            }
            else if(C[i]==' '){s++;}
            else {sp++;}
        }
        System.out.println("Vowels:- "+v);
        System.out.println("consonants:- "+c);
        System.out.println("digits:- "+d);
        System.out.println("spaces:- "+s);
        System.out.println("special:- "+sp);


    }
}
