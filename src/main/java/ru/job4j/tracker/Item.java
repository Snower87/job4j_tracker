package ru.job4j.tracker;

import java.time.LocalDateTime;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 6. Date. Отображение даты. [#310017] (ver.3)
 * @Описание 1. Откройте класс Item, который есть в проекте Tracker.
 * 2. Добавьте в него поле типа LocalDateTime, присвойте имя created. Сразу проинициализируйте это поле текущей датой и
 *    временем, используйте статический метод now().
 * 3. Добавьте геттер, чтобы получить доступ к созданному полю.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание Устранение ошибок, переопределение метода toString() (ver.2)
 *
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 2. Перегрузка конструктора. [173890#271554] (ver.1)
 * @Описание 1. В классе ru.job4j.tracker.Item, который у Вас уже есть в проекте Tracker, должно быть два поля:
 * - int id;
 * - String name.
 * Если какого-то поля не хватает, то добавьте его.
 * 2. Создайте три конструктора: без параметров, с параметром String name, с параметрами int id и String name.
 * Конструкторы с параметрами должны инициализировать поля, которые объявлены в классе.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 17.05.2021
 * @version 3
 */

public class Item {
    //1. Поля
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

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

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name;
    }
}