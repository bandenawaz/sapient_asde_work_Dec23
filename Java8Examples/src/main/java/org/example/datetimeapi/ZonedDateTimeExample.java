package org.example.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        //Lets print the local date and time
        LocalDateTime ldt =  LocalDateTime.now();
        System.out.println("Date and Time in India Zone is " + ldt);

        //Lets format the date using date formatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

        ZonedDateTime zdt = ldt.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("Indian Zoned time is " + dtf.format(zdt));


        ZoneId zoneID = ZoneId.of("Australia/Sydney");
        ZonedDateTime zdtt = ZonedDateTime.now(zoneID);
        System.out.println("Zone ID is: "+ zoneID);

        //lets print the pst time zone
//        ZonedDateTime pst = zdt.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println("Australian Zoned time is " +dtf.format(zdtt));
    }
}
