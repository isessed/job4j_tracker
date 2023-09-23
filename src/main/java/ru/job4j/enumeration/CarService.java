package ru.job4j.enumeration;

import ru.job4j.record.PersonRecord;

public class CarService {

    public static void main(String[] args) {
        Status toyota = Status.ACCEPTED;
        Status volvo = Status.WAITING;
        System.out.println(toyota);
        System.out.println(volvo);
        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar() + ", статус ремонта: " + order.getStatus().getMessage());
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println(s.name() + " " + s.ordinal());
        }
    }
}
