package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 1. Конструктор по умолчанию. [173889#271553]
 * @Описание 1. Создайте класс Error, определите в нем три поля: boolean active, int status, String message.
 * 2. Добавьте в этом классе 2 конструктора: явный конструктор по-умолчанию, конструктор с тремя параметрами, который будет
 * инициализировать поля переданными значениями.
 * 3. По аналогии с описанием добавьте метод, который будет выводить в консоль содержимое полей.
 * 4. Добавьте метод main(), в котором будете создавать объект с помощью явного конструктора по-умолчанию, а также несколько
 * объектов с помощью конструктора с параметрами. Вызовите на созданных объектах метод, добавленный в пункте 3;
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 16.05.2021
 * @version 1
 */

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна? " + this.active);
        System.out.println("Статус: " + this.status);
        System.out.println("Сообщение: " + this.message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error404 = new Error(false, 0, "Page not found!");
        Error error302 = new Error(true, 12, "Please, reboot. Critical error! ");
        Error error001 = new Error();

        System.out.println("Error404:");
        error404.printInfo();
        System.out.println("Error302:");
        error302.printInfo();
        System.out.println("Error001:");
        error001.printInfo();
    }
}
