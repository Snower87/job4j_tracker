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
        //boolean eq = first == second; // -> false, тк == используется только для примитивного типа данных
        //boolean eq = first.equals(second); // -> true, только после переопределения методов equals и hashCode
        boolean eq = first.hashCode() == second.hashCode(); // -> true, только после переопределения методов equals, hashCode
        System.out.println(eq);

        boolean eq1 = first == second;
        System.out.println("1) " + eq1); //false - до переопределения
        boolean eq2 = first.equals(second);
        System.out.println("2) " + eq2); //false
        boolean eq3 = first.equals(first);
        System.out.println("3) " + eq3); //false
        //До перегрузки метода equals() класса Product
        //1) false
        //2) false
        //3) true
        //После перегрузки метода equals() класса Product
        //1) false
        //2) true (+) два разных объекта равны, как и должно быть
        //3) true

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        //До перегрузки метода hashCode() класса Product
        //хэк-код объекта first равен  21499129
        //хэк-код объекта second равен 21589407
        //До перегрузки метода hashCode() класса Product
        //хэк-код объекта first равен  74347338
        //хэк-код объекта second равен 74347338 (+)
    }
}
