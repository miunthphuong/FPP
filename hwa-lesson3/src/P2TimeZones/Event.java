package P2TimeZones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Event {
    String name;
    LocalDate date;
    LocalTime time;

    public Event(String name, LocalDate date, LocalTime time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    void displayDayOfWeek(){
        System.out.println(date.getDayOfWeek() + " is the day of the week");
    }

    void isLeapYear(){
        System.out.println(date.getYear() +" "+ (date.isLeapYear()?"is":"is not") + " a leap year");
    }

    void currentToEventDays(){
        LocalDate now = LocalDate.now();
        System.out.println(Period.between(date,now).getDays() +" days left");
    }

    void displayDetails(){
        String day = date.getDayOfWeek().toString();
        String dateAsString = date.format(DateTimeFormatter.ofPattern("MMM dd,yyyy"));

        System.out.println(day + ", "+ dateAsString +" @ "+ time.toString() +" [" +ZoneId.systemDefault().getId()+ " ]");
    }
}
