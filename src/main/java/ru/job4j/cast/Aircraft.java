package ru.job4j.cast;

public class Aircraft implements Vehicle {

    @Override
    public void move() {
        System.out.println("Передвигается по воздуху.");
    }

    @Override
    public void weight() {
        System.out.println("Имеет массу: 160тонн");
    }
}
