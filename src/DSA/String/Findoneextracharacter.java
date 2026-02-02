package DSA.String;

import java.util.Arrays;

public class Findoneextracharacter {
    public static char findextrachar(String s1,String s2){
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        int i=0;
//        for(i=0;i<arr1.length;i++){
//            if(arr1[i]!=arr2[i]){
//                return arr2[i];
//            }
//        }
//        return arr2[i];
        int sum1=0,sum2=0;
        for(char a: arr1){
            sum1+=a;
        }
        for (char a:arr2){
            sum2+=a;
        }
        return (char)(sum2-sum1);

        //return (char) (s2.chars().sum()-s1.chars().sum());
    }

    public static void main(String[] args) {
        String s1="bancezz";
        String s2="abcenzzf";
        System.out.println(findextrachar(s1,s2));
    }
}
