package P2TimeZones;

import java.time.*;
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

    void convertToTimeZone(String targetZone) {

            ZoneId systemZone = ZoneId.systemDefault();
            ZoneId newZone = ZoneId.of(targetZone);

            ZonedDateTime eventDateTime =
                    ZonedDateTime.of(date, time, systemZone);

            ZonedDateTime converted =
                    eventDateTime.withZoneSameInstant(newZone);

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm");

            System.out.println("Converted Time:");
            System.out.println(converted.format(formatter) + " [" + newZone.getId() + "]");
    }




}
