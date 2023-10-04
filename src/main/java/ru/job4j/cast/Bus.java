package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Передвигается по дорогам общего пользования.");
    }

    @Override
    public void weight() {
        System.out.println("Имеет массу: 12тонн");
    }
}
