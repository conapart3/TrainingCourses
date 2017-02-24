package com.example.j8_new_features;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

public class DateTimeFormatTest
{

    public static void main(String[] args) throws InterruptedException
    {
        // Just a local date no time zone, etc.
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println("Local date in ISO_DATE format: " +df.format(currentDate));

        LocalTime currentTIme = LocalTime.now();
        DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
        System.out.println("Local time in ISO TIME format: " + tf.format(currentTIme));

        LocalDateTime currentDT = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Local date time in ISO DATE TIME format: " + dtf.format(currentDT));

        DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Long format style current date time: " + f_long.format(currentDT));

        DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Short format style current date time: " + f_short.format(currentDT));

        String fr_short = f_short.withLocale(Locale.FRANCE).format(currentDT);
        String fr_long = f_long.withLocale(Locale.FRANCE).format(currentDT);
        System.out.println(fr_short);
        System.out.println(fr_long);

        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .appendLiteral("||")
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral("||")
            .appendValue(ChronoField.YEAR)
            .appendLiteral("--")
            .appendValue(ChronoField.CLOCK_HOUR_OF_DAY)
            .appendLiteral(".")
            .appendValue(ChronoField.MINUTE_OF_HOUR)
            .appendLiteral(".")
            .appendValue(ChronoField.SECOND_OF_MINUTE)
            .appendLiteral(".")
            .appendValue(ChronoField.MILLI_OF_SECOND);

        DateTimeFormatter f = b.toFormatter();
        System.out.println("Custom date time formatter using a builder: " + f.format(currentDT));


        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dtf2.format(dt));

        ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dtf2.format(ny));

        Set<String> zones = ZoneId.getAvailableZoneIds();

        Predicate<String> condition = str -> str.contains("Europe");
        zones.stream().filter(condition).forEach(z -> System.out.println(z));
    }
}
