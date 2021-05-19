package ru.job4j.encapsulation;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 0. Что такое инкапсуляция. [3818#271568]
 * @Описание 1. Ниже приведет класс ru.job4j.encapsulation.Config.
 * public class Config {
 *     String name;
 *     protected int position;
 *     public String[] properties;
 *
 *     public Config(String name) {
 *         this.name = name;
 *     }
 *
 *     void print() {
 *         System.out.println(position);
 *     }
 *
 *     protected String getProperty(String key) {
 *         return search(key);
 *     }
 *
 *     private String search(String key) {
 *         return key;
 *     }
 * }
 * 2. Создайте этот класс в своем проекте.
 * 3. В этом классе есть 5 нарушений оговоренный выше правил.
 * - Для всех полей используем только модификатор private.
 * - Для классов - public. Во второй и третьей части курса так же применим для классов private.
 * - Для методов - public или private. Общее правило, если метод имеет модификатор default или protected его нужно переде-
 * лать на public
 * 4. Вам необходимо устранить эти нарушения.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 19.05.2021
 * @version 1
 */

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
