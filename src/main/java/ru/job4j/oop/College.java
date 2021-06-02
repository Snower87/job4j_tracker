package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3.1. Приведение типов. Повышение типа и понижение типа. [181322#271508]
 * @Описание 1. Создайте классы в пакете ru.job4j.oop;
 * Student > Freshman. Также нам уже доступен класс Object, его создавать не нужно.
 * 2. Создайте класс ru.job4j.oop.College с методом main.
 *    В нем сделайте приведение объекта Freshman к Student, а потом к Object. 
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class College {
    public static void main(String[] args) {
        //создаем объект класса Freshman
        Freshman freshman = new Freshman();
        // Приведение типа за счет <ПОВЫШЕНИЯ> по иерархии.
        // Приведение к типу родителя Student
        Student student =  freshman;
        Student student2 = new Freshman();
        // Приведение к типу родителя Object
        Object obj = freshman;
    }
}
