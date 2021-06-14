package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.4. Пользовательские исключения. [219367#271524]
 * @Описание 1. Практика работы с исключениями (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        /*load jdbc*/
    }

    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
            //load(null);
        } catch (UserInputException ex) {
            ex.printStackTrace();
        }

    }
}
