package ru.job4j.validate;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 8. Что такое валидация? [246864#271566]
 * @Описание 1. Практира работы по валидации входных пар-ов метода div() для класса DivByZero (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 1
 */

public class DivByZero {
    public static int div(int first, int second) {
        int rsl = -1;
        if (second == 0) {
            System.out.println("Div by 0, return def value -1");
        } else {
            rsl = first / second;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = div(10, 0);
        System.out.println(rsl);
    }
}
