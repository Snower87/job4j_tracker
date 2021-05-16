package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 1. Конструктор по умолчанию. [173889#271553]
 * @Описание 1. Практика создания объектов, конкструкторов с параметрами и по-умолчанию (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 16.05.2021
 * @version 1
 */

public class Computer {
    //1. Поля
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    //2. Конструктор
    public Computer() {
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    //3. Методы
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer compI7 = new Computer(true, 500, "Intel Core I7-10700K");
        compI7.printInfo();
        Computer compRyzen5 = new Computer(true, 256, "AMD Ryzen 5 3600");
        compRyzen5.printInfo();
        Computer comp3 = new Computer();
        comp3.printInfo();
    }
}
