package calendar;
import java.time.LocalDate;
import java.util.Calendar;

public class DateTracker {
    public static void main(String[] args) {
        java.util.Calendar rightnow = java.util.Calendar.getInstance();
        rightnow.setWeekDate(2015, 8, 5);
        System.out.println((rightnow.getTime()));
        }
}

//useless comment
