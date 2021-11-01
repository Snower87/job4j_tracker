package ru.job4j.pojo;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 4. Сравнение моделей. Метод equals. [174893#271562]
 * @Описание 1. Практика сравнения ссылочных типов данных (объектов) через equals()
 * и hashCode() (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.05.2021
 * @version 1
 */

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean eq = first.hashCode() == second.hashCode();
        System.out.println(eq);

        boolean eq1 = first == second;
        System.out.println("1) " + eq1);
        boolean eq2 = first.equals(second);
        System.out.println("2) " + eq2);
        boolean eq3 = first.equals(first);
        System.out.println("3) " + eq3);

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
    }
}
