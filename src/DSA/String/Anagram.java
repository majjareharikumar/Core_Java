package DSA.String;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s1=new String(arr1);
        s2=new String(arr2);
        //return s1.equals(s2);
        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        System.out.print(isAnagram(s1,s2));
    }
}
