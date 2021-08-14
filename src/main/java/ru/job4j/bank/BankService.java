package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 /* Класс BankService реализует банковский сервис 1) добавление функционала (#92)
 * @author Sergei Begletsov
 * @since 14.08.2021
 * @version 1
 */

public class BankService {
    /**
     * поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового пользователя в систему
     * @param user имя пользователя
     */
    public void addUser(User user) {
        //если пользователь не найден, то добавляем его
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * Добавление нового расчетного счета для пользователя в системе
     * @param passport паспорт пользователя
     * @param account новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        //1. Находим пользователя по паспорту
        User user = findByPassport(passport);

        //2. После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
        // В этом методе должна быть проверка, что такого счета у пользователя еще нет.

        //2. Получаем все счета с реквизитами пользователя
        List<Account> listAccountsUser = users.get(user);

        //3. Проверяем если такой счет уже
        boolean exist = false; //не существует
        for (Account nextAccount: listAccountsUser) {
            if (nextAccount.equals(account)) {
                //3.1 Аккаунт пользователя найден - не добавляем
                exist = true;
            }
        }

        //3.2 Аккаунт пользователя не найден
        if (!exist) {
            listAccountsUser.add(account);
            users.put(user, listAccountsUser);
        }
    }

    /**
     * Поиск пользователя по паспорту
     * @param passport паспорт пользователя
     * @return пользователя User при успешном поиске, null - если пользователя не нашли
     */
    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Поиск пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite счет пользователя
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> listAccountsUser = users.get(user);
                for (int index = 0; index < listAccountsUser.size(); index++) {
                    if (listAccountsUser.get(index).getRequisite().equals(requisite)) {
                        return listAccountsUser.get(index);
                    }
                }
            }
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
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        //1. Поиск пользователей
        User userFrom = findByPassport(srcPassport);
        User userTo   = findByPassport(destPassport);

        //2. Получаем все счета с реквизитами пользователей
        List<Account> alldAccountUserFrom = users.get(userFrom);
        List<Account> alldAccountUserTo   = users.get(userTo);

        //3. Ищем конкретные счета откуда и куда будут деньги переводиться
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo   = findByRequisite(destPassport, destRequisite);

        //4. Ищем индекс в списке этих счетов
        int indexAccountFrom = alldAccountUserFrom.indexOf(accountFrom);
        int indexAccountTo   = alldAccountUserFrom.indexOf(accountTo);

        //5. Проверки:
        //5.1. Проверка существования счета с коротого перевод осуществяется
        if (accountFrom == null) {
            return rsl;
        }

        //5.2. Проверка существования счета на который перевод осуществяется
        if (accountTo == null) {
            return rsl;
        }

        //5.3 Проверка, что денег на счете достаточно
        if (accountFrom.getBalance() < amount) {
            return rsl;
        }

        //6. Делаем перевод денег со счета -> на счет
        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);
        rsl = true;

        return rsl;
    }
}
