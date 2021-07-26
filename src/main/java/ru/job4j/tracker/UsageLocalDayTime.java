package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 9. toString. [#310018] (ver.2)
 * @Описание 1. В классе ru.job4j.tracker.Item сгенерируйте переопределенный метод toString(). При этом надо сохранить
 * форматирование даты, как мы делали в задании 6. Date. Отображение даты. Для этого в поле в качестве константы мы
 * выносим DateTimeFormatter следующим образом:
 * - private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
 * и тогда сгенерированный toString() с использованием DateTimeFormatter будет выглядеть примерно следующим образом:
 * - return ... ", created=" + created.format(FORMATTER)
 * 2. Создайте класс StartUI, в котором создайте 1 объект класса Item, выведите созданный объект в консоль. Проверьте,
 * что вывод даты созданной заявки в отличие от задачи 6. Date. Отображение даты не изменился.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 6. Date. Отображение даты. [#310017] (ver.1)
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
 * @version 2
 */

public class UsageLocalDayTime {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getCreated().format(formatter));

        Item item2 = new Item(1, "first");
        System.out.println(item2);
    }
}
