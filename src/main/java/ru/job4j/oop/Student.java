package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.2. Вызов метода объекта. [166085#271544] (ver.1)
 * @Описание 1. Создайте класс ru.job4j.oop.Student. Добавьте в него метод public void song().
 * Этот метод должен выводить на консоль слова "I believe I can fly".
 * 2. В методе main() попросите Петю три раза сыграть на баяне и три раза спеть.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.3. Вызов метода с аргументами. [166086#271545] (ver.2)
 * @Описание 1. Доработал класс, добавив в него переогруженный метод public void music(String lyrics) (по описанию к задаче).
 * 2. В методе main() вызовите новый метод с выводом на консоль.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 2
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
     * Перегрузка метода со входным пар-ом (строкой)
     * @return вывод на консоль строки
     */
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
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
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
