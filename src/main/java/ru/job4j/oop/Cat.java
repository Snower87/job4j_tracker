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
 *
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.5. Поля объекта. [166083#271543] (ver.3)
 * @Описание 1. Создайте дополнительное поле private String name. Это поле должно содержать кличку котика.
 * 2. Создайте метод public void giveNick(String nick). Этот метод должен записывать переменную nick в поле name.
 * 3. Измените метод void show() так, чтобы при его вызове в консоль выводилась информация: имя котика и что он ел.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 10.05.2021
 * @version 3
 */

public class Cat {
    private String food;
    private String name;

    /**
     * Выводит на консоль строку вида: кличка + "ел" + что поел
     */
    public void show() {
        System.out.println(this.name + " ел " + this.food);
    }

    /**
     * Присваивает значение скрытой переменной food
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * Присваивает значение скрытой переменной name
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

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

        System.out.println("There are gav's food:");
        Cat gav = new Cat();
        gav.eat("котлету");
        gav.giveNick("гав");
        gav.show();
        System.out.println("There are black's food:");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("рыбу");
        black.show();
    }
}
