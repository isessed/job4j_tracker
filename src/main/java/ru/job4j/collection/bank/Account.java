package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс представляет собой банковский аккаунт с заданным реквизитом и балансом.
 * Реквизит — уникальный идентификатор аккаунта.
 * @author PAVEL PETROV
 * @version 1.0
 */
public class Account {

    /**
     * Реквизит аккаунта
     */
    private String requisite;

    /**
     * Баланс аккаунта
     */
    private double balance;

    /**
     * Конструктор класса, инициализирует аккаунт с заданным реквизитом и балансом.
     * @param requisite реквизит аккаунта
     * @param balance   баланс аккаунта
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод для получения реквизита аккаунта.
     * @return реквизит аккаунта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод для установки нового реквизита аккаунта.
     * @param requisite новый реквизит аккаунта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод для получения баланса аккаунта.
     * @return баланс аккаунта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод для установки нового баланса аккаунта.
     * @param balance новый баланс аккаунта
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределение метода equals() для сравнения аккаунтов на основе реквизита.
     * @param o объект для сравнения
     * @return true, если аккаунты равны, false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределение метода hashCode() для генерации хэш-кода на основе реквизита.
     * @return хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
