package DSA.String;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Panagram {
    public static boolean isPanagram(String s){
        char[] arr=s.toCharArray();
        Set<Character> set=new HashSet<>();

        for(char a: arr){
            set.add(a);
        }
        if(set.size()<26){
            return false;
        }


        return true;
    }

    public static void main(String[] args) {
        String s="Thequickbrownfoxjumpsovertheoplazydog";
        System.out.println(isPanagram(s));
    }
}
