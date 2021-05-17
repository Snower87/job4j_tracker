package ru.job4j.tracker;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 2. Перегрузка конструктора. [173890#271554]
 * @Описание 1. В классе ru.job4j.tracker.Item, который у Вас уже есть в проекте Tracker, должно быть два поля:
 * - int id;
 * - String name.
 * Если какого-то поля не хватает, то добавьте его.
 * 2. Создайте три конструктора: без параметров, с параметром String name, с параметрами int id и String name.
 * Конструкторы с параметрами должны инициализировать поля, которые объявлены в классе.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 17.05.2021
 * @version 1
 */

public class Item {
    //1. Поля
    private int id;
    private String name;

    //2. Конструкторы
    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //3. Методы
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}