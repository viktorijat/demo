package codility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendar1 {

    enum Months {

    }

    public static void main(String[] args) throws ParseException {
        System.out.println(solution("2014", "April", "May", "Wednesday"));
    }

    private static int getWeeksInMonth(Date vacationBegin) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(vacationBegin);
        boolean monday = calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY;

        int end = calendar.get(Calendar.WEEK_OF_MONTH);
        if (monday) {
            return end;
        }
        return end - 1;

    }


    private static int solution(String Y, String A, String B, String W) throws ParseException {

        int year = Integer.parseInt(Y);
        DateFormat f = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        String vacationBeginString = A + " 1 " + Y;

        Date vacationBegin = f.parse(vacationBeginString);
        int months = Months.valueOf(B).ordinal();
        YearMonth m = YearMonth.of(year, months);
        String vacationEndsString = A + " " + m.lengthOfMonth() + " " + Y;
        Date vacationEnds = f.parse(vacationEndsString);


        int weeksInFirstMonth = getWeeksInMonth(vacationBegin);
        int weeksInLastMonth = getWeeksInMonth(vacationEnds);




        return 0;
    }
}
