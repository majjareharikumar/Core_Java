package Interview.java8.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class second_highest_number {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,7,5,6,8,1,2,3,4,6);
                     int secondhigh= nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondhigh);

    }

}
