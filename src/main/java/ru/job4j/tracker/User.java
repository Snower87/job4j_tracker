package ru.job4j.tracker;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 9. toString. [#310018]
 * @Описание 1. Практика работы с переопределенным методом toString().
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 26.07.2021
 * @version 1
 */

public class User {
    private int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
