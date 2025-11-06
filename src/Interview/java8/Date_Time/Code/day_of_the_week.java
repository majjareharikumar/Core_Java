package Interview.java8.Date_Time.Code;

import java.time.LocalDate;

public class day_of_the_week {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2025,12,6);
        System.out.println("Day of week:- "+date.getDayOfWeek());
    }
}
