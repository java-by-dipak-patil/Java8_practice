package com.joda.demo;

import java.time.*;

public class JodaTestDemo {

    public static void main(String[] args) {
        System.out.println("Local date ");
        LocalDate date= LocalDate.now();
        System.out.println(date);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
        System.out.println();
        System.out.println("Local time ");
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        System.out.println("local date and time ");
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
