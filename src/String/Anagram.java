package String;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s1,String s2){

        if(s1.length()!=s2.length()) return false;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char Arr1[]=s1.toCharArray();
        char Arr2[]=s2.toCharArray();
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1,Arr2);
    }

    public static void main(String[] args) {
        String s1="Silent";
        String s2="Listen";

        System.out.println(isAnagram(s1,s2));
    }


}
