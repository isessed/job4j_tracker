package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс представляет банковский сервис для управления пользователями и их счетами.
 * @author PAVEL PETROV
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение пользователей и их счетов осуществляется в коллекции типа HashMap.
     * Ключ — объект User, значение — список его счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод для добавления нового пользователя в систему.
     * @param user новый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод для удаления пользователя из системы по его паспорту.
     * @param passport паспорт пользователя
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод для добавления нового счета пользователю по его паспорту.
     * @param passport паспорт пользователя
     * @param account новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по его паспорту.
     * @param passport паспорт пользователя
     * @return объект User, если пользователь найден, иначе null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод для поиска счета пользователя по его паспорту и реквизитам.
     * @param passport паспорт пользователя
     * @param requisite реквизиты счета
     * @return объект Account, если счет найден, иначе null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
        }
        return null;
    }

    /**
     * Метод для осуществления перевода денег между счетами.
     * @param sourcePassport паспорт отправителя
     * @param sourceRequisite реквизиты счета отправителя
     * @param destinationPassport паспорт получателя
     * @param destinationRequisite реквизиты счета получателя
     * @param amount сумма перевода
     * @return true, если перевод успешен, false в противном случае
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite, double amount) {
        boolean rsl = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null && sourceAccount.getBalance() >= amount) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод для получения списка счетов пользователя.
     * @param user пользователь, для которого нужно получить список счетов
     * @return список счетов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
