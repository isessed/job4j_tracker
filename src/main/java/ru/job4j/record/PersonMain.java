package ru.job4j.record;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        System.out.println(person);
        PersonRecord personRecord = new PersonRecord("Иван", 30);
        System.out.println(personRecord);
        PersonRecord personRecord1 = new PersonRecord("Иван", 30);
        System.out.println(personRecord.equals(personRecord1));
    }
}
