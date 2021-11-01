package ru.job4j.max;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 5.1. Зона видимости переменных. [180147#271549]
 * @Описание 1. Код ниже содержит ошибку. Код должен вывести на экран массив, который мы передали в метод to(...).
 * Метод to(..) должен записать аргумент array в поле класса.
 * 2. Исправьте ошибку.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.05.2021
 * @version 1
 */

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}