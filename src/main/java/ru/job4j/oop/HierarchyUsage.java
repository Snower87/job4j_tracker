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
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;

        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle;
    }
}
