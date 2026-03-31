package DSA.Array.mixedArray;

import java.util.stream.Collectors;

public class Count_digits_and_characters {
    public static void main(String[] args) {
        char[] arr={'q','3','f','6','v','9'};
        int dcount=0;
        int ccount=0;

        for(char c:arr){
            if(Character.isDigit(c)){
                dcount++;
            }
            else{
                ccount++;
            }
        }

        System.out.println("Digit count:-"+dcount);
        System.out.println("Char count:-"+ccount);

        //Java8
        long Dcount=new String(arr).chars()
                .filter(Character::isDigit)
                .count();

        System.out.println("D count:-"+Dcount);

        long Ccount=new String(arr).chars()
                        .filter(Character::isAlphabetic)
                                .count();
        System.out.println("Ch count:-"+Ccount);

    }
}
