package DSA.String;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll(" ","").toLowerCase();
        s2=s2.replaceAll(" ","").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        String s1="sil ent";
        String s2="listen";
        System.out.println(isAnagram(s1,s2));

        //with string methods
        System.out.println("String mentods");
        String str1="silent";
        String str2="listen";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("It is not anagram");
        }
        while (str1.length()>0){

                char c=str1.charAt(0);
                str1=str1.replace(c+"","");
                str2=str2.replace(c+"","");

        }
        if(str1.length()==str2.length()){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("It is not anagram");
        }

    }
}
