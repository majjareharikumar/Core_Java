package Java8.coding;

import java.util.List;

//Write a Java 8 program to find the sum of digits of a list of integers?
public class TotalDigitSum {
    public static void main(String[] args) {
        List<Integer> list=List.of(123,32,43,4456,123);

        int sumOfDigits=list.stream().
                mapToInt(n->String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum())
                .sum();
        System.out.println("SumOfDigits :- "+sumOfDigits);
    }

}
