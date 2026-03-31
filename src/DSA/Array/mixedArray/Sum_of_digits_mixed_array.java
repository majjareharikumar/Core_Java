package DSA.Array.mixedArray;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

public class Sum_of_digits_mixed_array {
    public static void main(String[] args) {
        char[] arr={'a','f','3','5','p'};

        int sum=0;
        for(char c:arr){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.println(sum);

        //Java8
        int s=new String(arr).chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue).sum();
        System.out.println(s);
    }
}
