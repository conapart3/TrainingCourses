package com.example.j8_new_features;

import java.time.*;

public class TimeSpans
{

    public static void main(String[] args) throws InterruptedException
    {
        Instant start = Instant.now();
        Thread.sleep(1000);

        Instant end = Instant.now();
        System.out.println(end);

        Duration elapsed = Duration.between(start, end);
        System.out.println("Elapsed time: " + elapsed.toMillis());

        // Just a local date no time zone, etc.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // New datetime api is 1 based - more intuitive - 1 means January, 2 Feb, etc.
        LocalDate specificDate = LocalDate.of(2000, 1, 1);
        System.out.println(specificDate);

        // Only want to represent a time value?
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        // A specific time value
        LocalTime specificTime = LocalTime.of(14, 0, 45);
        System.out.println(specificTime);

        // use the local date time class
        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println(currentDT);

        // use a specific local date time using the specific date and specific time created
        LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
        System.out.println(specificDT);
    }
}
