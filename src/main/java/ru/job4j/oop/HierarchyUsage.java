package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3.1. Приведение типов. Повышение типа и понижение типа. [181322#271508]
 * @Описание 1. Практика приведения типов данных (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class HierarchyUsage {
    public static void main(String[] args) {
        // создаем объекта класса Car.
        Car car = new Car();
        // Приведение типа за счет <ПОВЫШЕНИЯ> по иерархии.
        // делаем приведение к типу родителя Transport.
        Transport tp = car;
        // делаем приведение к типу родителя Object.
        Object obj = car;
        // Приведение типа при создании объекта.
        Object ocar = new Car();
        // Приведение типа за счет <ПОНИЖЕНИЯ> по иерархии.
        Car carFromObject = (Car) ocar;

        // Ошибка в приведении типа.
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // код завершится с ошибок приведения типов ClassCastException
    }
}
