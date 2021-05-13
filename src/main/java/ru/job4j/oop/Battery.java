package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.7. Состояние объекта. [167388#271548]
 * @Описание 1. Создайте класс ru.job4j.oop.Battery. В нем должно быть поле private int load.
 * 2. Создайте метод public void exchange(Battery another). Этот метод должен списывать заряд из батареи у кого вызывали
 * метод exchange и добавить к объекту another.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 1
 */

public class Battery {
    //1. Параметры:
    private int load;

    //2. Конструкторы:
    public Battery(int size) {
        this.load = size;
    }

    //3. Методы
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(20);

        System.out.println("Exchange before: first - " + first.load + ". second - " + second.load);
        first.exchange(second);
        System.out.println("Exchange after:  first - " + first.load + ". second - " + second.load);
    }
}
