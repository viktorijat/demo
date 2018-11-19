package demo2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Times {

    public static void main(String[] args) {

        test1();
    }

    private static void test1() {

        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));

        long hrs = ChronoUnit.HOURS.between(depart, arrive);
        System.out.println("hours travel " + hrs); //4
    }
}
