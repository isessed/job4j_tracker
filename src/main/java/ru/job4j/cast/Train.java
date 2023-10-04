package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Передвигается по рельсам.");
    }

    @Override
    public void weight() {
        System.out.println("Имеет массу: 500тонн");
    }
}
