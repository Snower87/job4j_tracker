package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 2.1. Рефакторинг - Расстояние между точками. [122587#271538] (ver.1)
 * @Описание 1. Произведите рефакторинг кода (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 4. Расстояние между точками в трехмерном пространстве. [122643#271540] (ver.2)
 * @Описание 1. В классе ru.job4j.condition.Point из задания 3.4. Расстояние между точками в системе координат добавьте
 * новый функционал.
 * 2. Перегрузите конструктор Point для 3D пространства.
 * 3. Реализуйте метод distance3d(), ипользуйте формулу из описания задачи.
 * 4. Напишите тесты. Протестируйте код в junit.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 2
 */

public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка" (для 2D плоскости)
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор для 3D-пространства
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        //Вариант №1
        this.x = x;
        this.y = y;
        this.z = z;
        //Вариант №2
        //new Point(x, y);
        //this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println("distance point (0,0) - (0,2) = " + dist);
    }
}