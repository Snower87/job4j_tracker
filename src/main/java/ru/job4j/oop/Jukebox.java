package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.3. Вызов метода с аргументами. [166086#271545]
 * @Описание 1. Создайте класс ru.job4j.oop.Jukebox. Добавьте в него метод public void music(int position).
 * 2. Внутри метода сделайте if else:
 * - Если position равно 1, то в консоль должны выводиться слова песни "Пусть бегут неуклюже".
 * - Если равно 2, то в консоль должны выводиться слова песни "Спокойной ночи".
 * - Во всех остальных случаях должно появиться "Песня не найдена".
 * 3. Напишите метод main() с демонстрацией работы этого метода и объекта этого класса.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 1
 */

public class Jukebox {
    /**
     * Выводит на консоль название песни по соответствующему номеру
     * @param position номер песни (1 - Пусть бегут неуклюже, 2 - Спокойной ночи, другое - Песня не найдена)
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(-1);
        song.music(10);
    }
}
