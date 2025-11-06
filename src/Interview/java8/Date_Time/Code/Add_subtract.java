package Interview.java8.Date_Time.Code;

import java.time.LocalDate;

public class Add_subtract {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();

        System.out.println("Today:- "+today);
        System.out.println("After 10 days:- "+today.plusDays(10));
        System.out.println("After 2 weeks:- "+today.plusWeeks(2));
        System.out.println("After 1 month:- "+today.plusMonths(1));
        System.out.println("After 1 year:- "+today.plusYears(1));

        System.out.println("***************************************");
        System.out.println("Before 10 days:- "+today.minusDays(10));
        System.out.println("Before 2 weeks:- "+today.minusWeeks(2));
        System.out.println("Before 1 month:- "+today.minusMonths(1));
        System.out.println("Before 1 year:- "+today.minusYears(1));
    }
}
