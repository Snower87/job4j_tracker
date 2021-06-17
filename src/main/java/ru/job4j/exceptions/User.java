package ru.job4j.exceptions;

public class User {
    private String username;
    private boolean valid;

    /**
     * Конструтор с двумя полями: имя, доступность
     * @param username имя пользователя
     * @param valid валидность = правильность = доступность
     */
    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    /**
     * Метод для получения имени пользователя
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для получения правильности/доступности пользователя
     * @return true - доступно, false - не доступно
     */
    public boolean isValid() {
        return valid;
    }
}
