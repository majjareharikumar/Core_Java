package Interview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class practice {

    public static void main(String[] args) {
        String dateStr="2022-01-01";
        LocalDate localDate=LocalDate.parse(dateStr,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
