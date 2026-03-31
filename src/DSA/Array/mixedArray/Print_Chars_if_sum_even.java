package DSA.Array.mixedArray;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Print_Chars_if_sum_even {
    public static void main(String[] args) {
        char[] arr={'2','e','t','5','8','f','p'};

        int sum=0;
        for(char c:arr){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }

        if(sum%2==0){
            System.out.println("Sum is even");
            for(char c:arr){
                if(!Character.isDigit(c)){
                    System.out.println(c);
                }
            }
        }
        else{
            System.out.println("Sum is not even so printing digits");
            for(char c:arr){
                if(Character.isDigit(c)){
                    System.out.println(Character.getNumericValue(c));
                }
            }
        }
        //Java8
        System.out.println("Java 8");
        int s= new String(arr).chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        if(sum%2==0){
            System.out.println("Sum is Even");
            List<Character> result=new String(arr).chars()
                    .mapToObj(c->(char)c)
                    .filter(c->!Character.isDigit(c))
                    .toList();

            result.forEach(System.out::println);
        }
        else{
            System.out.println("Sum is not even");
            List<Integer> result =new String(arr).chars()
                    .mapToObj(c->(char)c)
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue)
                    .toList();

            result.forEach(System.out::println);
        }

    }


}
