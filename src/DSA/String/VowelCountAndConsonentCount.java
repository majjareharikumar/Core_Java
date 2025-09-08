package DSA.String;

import java.util.Arrays;

public class VowelCountAndConsonentCount {

    public static void count(String s){
        s=s.toLowerCase();
        long VowelCount=0,consonentCount=0;
        char[] ch=s.toCharArray();

//        for(int i=0;i<ch.length;i++){
//            if(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'){
//                VowelCount++;
//            }
//            else {
//                consonentCount++;
//            }
//        }

//        for(char c:ch){
//            if("aeiou".indexOf(c+"")!=-1){
//                VowelCount++;
//            }
//            else{
//                consonentCount++;
//            }
//        }

        VowelCount= s.chars().filter(c->"aeiou".indexOf(c)!=-1).count();
        consonentCount=s.chars().filter(c->"aeiou".indexOf(c)==-1).count();

        System.out.println("Given String:- "+s);
        System.out.println("Vowels count in given String :- "+VowelCount);
        System.out.println("Consonent count in given String :- "+consonentCount);
    }

    public static void main(String[] args) {
        String s="Majjareharikumar";
        count(s);
    }
}
