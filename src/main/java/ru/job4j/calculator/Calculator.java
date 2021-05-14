package ru.job4j.calculator;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 3. Перегрузить метод max для трех чисел. [122644#271541]
 * @Описание 1. Создайте класс ru.job4j.calculator.Calculator с перегруженными методами add() (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.05.2021
 * @version 1
 */

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    //перегрузка метода
    public double add(double first, double second, double third) {
        //Вариант №1 сложения
        //return first + second + third;
        //Вариант №2 сложения
        return add(first, add(second, third));
    }
}
