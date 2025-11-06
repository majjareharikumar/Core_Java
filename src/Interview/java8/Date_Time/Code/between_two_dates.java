package Interview.java8.Date_Time.Code;

import java.time.LocalDate;
import java.time.Period;

public class between_two_dates {

    public static void main(String[] args) {
        LocalDate start =LocalDate.of(2020,3,21);
        LocalDate end=LocalDate.of(2025,3,30);
        Period period=Period.between(start,end);
        System.out.println("Year: "+period.getYears() + " Month: "+period.getMonths()+" Day: "+period.getDays());

    }

}
