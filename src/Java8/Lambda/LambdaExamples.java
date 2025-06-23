package Java8.Lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExamples {

    interface  myMath{
        int operation(int a,int b);
    }
    public static void main(String[] args) {

        // 1. Basic lambda for Runnable interface
        Runnable runnable=()->System.out.println("Runnable interface");
        runnable.run();

        // 2. Lambda with custom functional interface
        myMath addition=(s1,s2)->s1+s2;
        System.out.println("Addition of 2,5 is :-"+addition.operation(2,5));

        // 3. Using Predicate (returns boolean)
        Predicate<String> StartWithH=s->s.startsWith("H");
        System.out.println("Is Hari start with H?:- "+StartWithH.test("Hari"));

        // 4. Using Consumer (takes input, returns nothing)
        Consumer<String> StringUpper=s->System.out.println(s.toUpperCase());
        StringUpper.accept("majjare hari kumar");

        // 5. Using Supplier (takes nothing, returns value)
        Supplier<Double> randomValue=()->Math.random();
        System.out.println("Random Value:- "+randomValue.get());
    }
}
