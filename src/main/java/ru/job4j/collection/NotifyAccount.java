package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 /* Класс NotifyAccount проверяет уникальность пользовательских аккаунтов (#88)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account: accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}
