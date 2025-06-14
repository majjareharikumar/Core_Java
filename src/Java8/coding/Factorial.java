package Java8.coding;

import java.util.stream.IntStream;

//Write a Java 8 program to find the factorial of a given number ?
public class Factorial {
    public static void main(String[] args) {
        int a=5;
        int factorial= IntStream.rangeClosed(1,a).reduce(1,(i,b)->i*b);

        System.out.println("Factorial of 5 is :- "+factorial);
    }
}
