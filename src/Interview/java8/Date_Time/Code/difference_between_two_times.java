package Interview.java8.Date_Time.Code;

import java.time.Duration;
import java.time.LocalTime;

public class difference_between_two_times {
    public static void main(String[] args) {
        LocalTime time=LocalTime.of(9,30);
        LocalTime time1=LocalTime.of(12,45);
        Duration duration=Duration.between(time,time1);

        System.out.println("Hours: "+duration.toHours() + " Minutes: "+duration.toMinutes());
    }
}
