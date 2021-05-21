package ru.job4j.pojo;

import java.util.Date;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 2. Модель данных. [174683#271560]
 * @Описание 1. Создайте модель данных - Студент. ru.job4j.pojo.Student.
 * 2. В модели должны быть поля: ФИО, группа, дата поступления.
 * 3. Сгенерируйте аксессоры для этих полей (геттеры и сеттеры).
 * 4. Создайте класс ru.job4j.pojo.College с методом main. В методе main создайте объект Student и заполните поля
 * через set. Добавьте вывод на консоль объекта student через методы get.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class College {
    public static void main(String[] args) {
        Student ivanPetrov = new Student();
        ivanPetrov.setFirstName("Иван");
        ivanPetrov.setLastName("Петров");
        ivanPetrov.setGroup("ИТ-24020");
        ivanPetrov.setDateAccept(new Date());

        System.out.printf("Зачислен студент: ");
        System.out.println(ivanPetrov.getFirstName() + " " + ivanPetrov.getLastName());
        System.out.println("В группу: " + ivanPetrov.getGroup());
        System.out.printf("Дата зачисления: " + ivanPetrov.getDateAccept());
    }
}