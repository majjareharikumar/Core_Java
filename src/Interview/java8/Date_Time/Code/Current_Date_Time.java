package Interview.java8.Date_Time.Code;

import java.time.*;

public class Current_Date_Time {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        LocalTime currentTime=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();

        System.out.println("Current data:- "+currentDate);
        System.out.println("Current Time:- "+currentTime);
        System.out.println("Current Date & Time:- "+dateTime);
    }
}
