package AllConcepts;

import java.util.Arrays;
import java.util.List;

public class missingNumber {

    public static void findMissingNumber(List<Integer> numbers) {
        if(numbers==null || numbers.size()<2){
            System.out.println("Array must have more than 2 elements ");
        }

        int diff=numbers.get(1)-numbers.get(0);

        for(int i=0;i<numbers.size()-1;i++){
            int ex=numbers.get(i)+diff;
            if(numbers.get(i+1)!=ex){
                System.out.println("missing number is :-"+ex);
            }
        }
    }


    public static void main(String[] args) {
//        List<Integer> test1 = Arrays.asList(1,2,3,4,5,7,8,9,10);  // Missing 6
//        List<Integer> test2 = Arrays.asList(2,4,6,10,12,14,16,18,20); // Missing 8
//        List<Integer> test3 = Arrays.asList(1,3,5,9,11,13,15,17); // Missing 7

        List<Integer> test1= Arrays.asList(1,2,3,4,5,7,8,9,10);
        List<Integer> test2= Arrays.asList(2,4,6,10,12,14,16,18,20);
        List<Integer> test3= Arrays.asList(1,3,5,9,11,13,15,17);

        System.out.println("Test case 1:");
        findMissingNumber(test1);

        System.out.println("\nTest case 2:");
        findMissingNumber(test2);

        System.out.println("\nTest case 3:");
        findMissingNumber(test3);
    }
}
