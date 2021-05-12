package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.1. Создание объекта. [165452#271542] (ver.1)
 * @Описание 1. Создайте класс ru.job4j.oop.Cat.
 * 2. Попрактикуйтесь создавать объекты в методе main() класса Cat (из примера к задаче).
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.4. Вызов метода с возвращаемым типом. [167387#271547] (ver.2)
 * @Описание 1. Практика работы с методами, возвращающими значение (сделал по описанию к задаче).
 * @author Sergei Begletsov
 * @since 10.05.2021
 * @version 2
 */

public class Cat {
    /**
     * Возвращает голос кошки
     * @return String "may-may" для объекта типа Cat
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();

        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}
