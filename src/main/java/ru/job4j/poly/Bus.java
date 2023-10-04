package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Включить передачу. Нажать на педаль газа.");
    }

    @Override
    public void intPassengers(int count) {
        count = 100;
    }

    @Override
    public double refill(int fuel) {
        double price = 10.5;
        return price * fuel;
    }
}
