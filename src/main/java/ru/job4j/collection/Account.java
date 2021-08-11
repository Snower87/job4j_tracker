package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс Account класс-контейнер, хранит данные о пользователях: номер паспорта, имя пользователя, номер депозита (#88)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{" +
                "passport='" + passport + '\'' +
                ", username='" + username + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}
