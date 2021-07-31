package ru.job4j.tracker;

/**
 * @Раздел Блок 2. ООП / 6. ООА\П
 * @Задание 2. Singleton. [#94606]
 * @Описание 1. Практика работы с шаблоном Singleton (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 31.07.2021
 * @version 1
 */

public class Log4File {
    private static Log4File instance = null;

    private String[] messages = new String[1000];
    private int index = 0;

    private Log4File() {
    }

    public static Log4File getInstance() {
        if (instance == null) {
            instance = new Log4File();
        }
        return instance;
    }

    public void add(String message) {
        messages[index++] = message;
    }

    public void save() {
        /* T_O_D_O Сохраняем записи из массива messages в файл. */
    }

    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
    }
}
