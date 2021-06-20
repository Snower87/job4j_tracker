package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 3. Замена if-else-throw на if-throw. [49895#271520]
 * @Описание 1. Приведен код класса Find. Избавьтесь от блока if-else-throw.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 20.06.2021
 * @version 1
 */

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 0);
        System.out.println(rsl);
    }
}
