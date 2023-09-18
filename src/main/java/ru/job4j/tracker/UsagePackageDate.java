package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {

    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + currentDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDate.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}