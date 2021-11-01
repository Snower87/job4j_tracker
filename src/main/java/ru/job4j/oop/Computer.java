package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 1. Конструктор по умолчанию. [173889#271553] (ver.1)
 * @Описание 1. Практика создания объектов, конкструкторов с параметрами и по-умолчанию (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 2. Перегрузка конструктора. [173890#271554] (ver.2)
 * @Описание 1. Практика перегрузки конструкторов класса (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 16.05.2021
 * @version 2
 */

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

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
        Computer fourth = new Computer(240, "AMD Ryzen 5 3600");
        fourth.printInfo();
        Computer five = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        five.printInfo();
    }
}
