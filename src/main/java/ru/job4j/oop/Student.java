package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.2. Вызов метода объекта. [166085#271544]
 * @Описание 1. Создайте класс ru.job4j.oop.Student. Добавьте в него метод public void song().
 * Этот метод должен выводить на консоль слова "I believe I can fly".
 * 2. В методе main() попросите Петю три раза сыграть на баяне и три раза спеть.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 1
 */

public class Student {
    /**
     * Метод "играет музыка" на баяне
     * @return вывод на консоль строки
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод "поет песню"
     * @return вывод на консоль строки
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();

        petya.song();
        petya.song();
        petya.song();
    }
}
