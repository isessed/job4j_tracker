package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Petrov Pavel Valentinovich");
        student.setGroup("111");
        student.setEnrollment(new Date());
        System.out.println(student.getFullName() +  " Group № " + student.getGroup() +  " " + student.getEnrollment());
    }
}
