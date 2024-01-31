package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс представляет пользователя банковской системы с заданным паспортом и именем.
 * @author PAVEL PETROV
 * @version 1.0
 */
public class User {

    /**
     * Паспорт пользователя (уникальный идентификатор)
     */
    private String passport;

    /**
     * Имя пользователя
     */
    private String username;

    /**
     * Конструктор класса, инициализирует пользователя с заданным паспортом и именем.
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод для получения паспорта пользователя.
     * @return паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод для установки нового паспорта пользователя.
     * @param passport новый паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения имени пользователя.
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для установки нового имени пользователя.
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals() для сравнения пользователей на основе паспорта.
     * @param o объект для сравнения
     * @return true, если пользователи равны, false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hashCode() для генерации хэш-кода на основе паспорта.
     * @return хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
