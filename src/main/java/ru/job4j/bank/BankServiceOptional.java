package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 /* Класс BankService реализует банковский сервис 1) добавление функционала (#92)
 * 2) подчислил код в методах: addUser(), addAccount(), findByRequisite(), transferMoney() (#93)
 * 3) в методе addAccount() добавил проверку существования пользователя, убрал users.put(user, userAccountAll); (#94)
 * тк account уже добавлен к счетам пользователя, в методе transferMoney() поменял булеву логику с ИЛИ (||) на И (&&)
 * 4) передедал методы поиска по паспорту и реквизитам на использование Stream API (#124)
 * @author Sergei Begletsov
 * @since 14.08.2021
 * @version 4
 */

public class BankServiceOptional {
    /**
     * поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового пользователя в систему
     * @param user имя пользователя
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавление нового расчетного счета для пользователя в системе
     * @param passport паспорт пользователя
     * @param account новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);

        if (user != null) {
            List<Account> listAccountsUser = users.get(user);

            if (listAccountsUser != null) {

                if (!listAccountsUser.contains(account)) {
                    listAccountsUser.add(account);
                }
            }
        }
    }

    /**
     * Поиск пользователя по паспорту
     * @param passport паспорт пользователя
     * @return пользователя User при успешном поиске, null - если пользователя не нашли
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite счет пользователя
     * @return аккаунт Account пользователя, если поиск по реквизитам прошел успешно, если нет - null
     */
    public Account findByRequisite(String passport, String requisite) {
        User findUser = findByPassport(passport);

        if (findUser != null) {
            List<Account> listAccountsUser = users.get(findUser);

            return listAccountsUser.stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .get();
        }

        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт
     * @param srcPassport паспорт пользователя, который делает перевод (-->>)
     * @param srcRequisite счет пользователя, который делает перевод (-->>)
     * @param destPassport паспорт пользователя, кому делают перевод (<<--)
     * @param destRequisite счет пользователя, кому делают перевод (<<--)
     * @param amount кол-во денег
     * @return true - перевод успешно прошел, false - перевод не прошел
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo   = findByRequisite(destPassport, destRequisite);

        if (accountFrom != null && accountTo != null && accountFrom.getBalance() >= amount) {
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            accountTo.setBalance(accountTo.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}
