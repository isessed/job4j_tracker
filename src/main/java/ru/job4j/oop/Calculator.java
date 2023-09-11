package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(10);
        System.out.println(multiply);
        int minus = minus(10);
        System.out.println(minus);
        int divide = calculator.divide(10);
        System.out.println(divide);
        int sumAllOperation = calculator.sumAllOperation(10);
        System.out.println(sumAllOperation);
    }
}
