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
 * @author Sergei Begletsov
 * @since 14.08.2021
 * @version 3
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
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавление нового расчетного счета для пользователя в системе
     * @param passport паспорт пользователя
     * @param account новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        //1. Находим пользователя по паспорту
        User user = findByPassport(passport);

        //2. Проверяем, что пользователь существует (найден)
        if (user != null) {
            //3. Получаем все счета с реквизитами пользователя
            List<Account> listAccountsUser = users.get(user);

            //4. Проверяем, что у пользователя есть какие-то счета (не равно null)
            if (listAccountsUser != null) {

                //5. Есть счет у пользователя?
                if (!listAccountsUser.contains(account)) {
                    //5.1 Нет, счета пользователя не найден -> добавляем его
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
     * @return аккаунт Account пользователя, если поиск по реквизитам прошел успешно, если нет - null
     */
    public Account findByRequisite(String passport, String requisite) {
        //1. Ищем пользователя по паспорту
        User findUser = findByPassport(passport);

        //2. Пользователь найден?
        if (findUser != null) {
            //2.1 Да, пользователь найден

            //3. Получаем все счета с реквизитами пользователя
            List<Account> listAccountsUser = users.get(findUser);

            //4. Пробегаемся по всем счетам пользователя
            for (Account account : listAccountsUser) {
                //5. Ищем необходимые ревизиты пользователя
                if (account.getRequisite().equals(requisite)) {
                    //5.1 Возвращаем аккаунт пользователя
                    return account;
                }
            }
        }

            //2.2 Нет, пользователь не найлен
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
        //1. Ищем конкретные счета откуда и куда будут деньги переводиться
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo   = findByRequisite(destPassport, destRequisite);

        //2. Проверка существования:
        //2.1 Существует счет, с коротого осуществяется перевод?
        //2.2 Существует счет,  на который осуществяется перевод?
        //2.3 Денег на счете достаточно?
        if (accountFrom != null && accountTo != null && accountFrom.getBalance() >= amount) {
            //3.1 Да, все ОК. Делаем перевод денег со счета -> на счет
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            accountTo.setBalance(accountTo.getBalance() + amount);
            rsl = true;
        }

        //3.2 Нет, не ОК. Перевод денег не состоялся (см. п.2.1 - 2.3)
        return rsl;
    }
}
