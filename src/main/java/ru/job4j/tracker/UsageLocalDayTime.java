package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 6. Date. Отображение даты. [#310017]
 * @Описание 1. Откройте класс Item, который есть в проекте Tracker.
 * 2. Добавьте в него поле типа LocalDateTime, присвойте имя created. Сразу проинициализируйте это поле текущей датой и
 * временем, используйте статический метод now().
 * 3. Добавьте геттер, чтобы получить доступ к созданному полю.
 * 4. Добавьте класс StartUI, в нем создайте один объект Item. На этом объекте вызовите геттер поля created, выведите
 * полученную дату в консоль в отформатированном варианте, в качестве паттерна используйте следующую строку:
 *      "dd-MMMM-EEEE-yyyy HH:mm:ss"
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.07.2021
 * @version 1
 */

public class UsageLocalDayTime {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(formatter));
    }
}
