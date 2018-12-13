package exam3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Question17 {

    public static void main(String[] args) {

        LocalDateTime d1 = LocalDateTime.of(2016, 5, 1, 0, 0);
        LocalDateTime d2 = LocalDateTime.of(2016, 5, 31, 0, 0);

        d1.plus(30, ChronoUnit.DAYS);

        long seconds = Duration.between(d1, d2).getSeconds();
        long days =  ChronoUnit.DAYS.between(d1, d2);
        long months = ChronoUnit.MONTHS.between(d1, d2);
        System.out.println(seconds);
        System.out.println(days);
        System.out.println(months);
    }
}
