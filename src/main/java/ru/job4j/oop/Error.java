package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Описание ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error err = new Error(true, 2, "Нет доступа");
        err.printInfo();
    }
}
