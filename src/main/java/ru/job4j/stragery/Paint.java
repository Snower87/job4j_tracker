package ru.job4j.stragery;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 7. Шаблон проектирования - Стратегия. [786#271516]
 * @Описание 1. Нам необходимо продемонстрировать создание шаблона стратегия на примере реализации доски для рисования
 * и загрузки в них форм.
 * 2. Создать классы Paint, Triangle, Square, интерфейс Shape в пакете ru.job4j.strategy.
 * 3. В интерфейсе Shape объявить метод String draw(). Метод draw() должен возвращать фигуру в виде строки. 
 * package ru.job4j.strategy;
 * public interface Shape {
 *     String draw();
 * }
 * 4. Реализовать интерфейс Shape для квадрата (Square), треугольника (Triangle); 
 * 5. В классе Paint реализовать метод public void draw(Shape shape). Метод draw() должен печатать псевдокартинку
 * на консоль через метод System.out.println(shape.draw()) 
 * 6. Напишите тесты. Протестируйте код в junit.
 * 7. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 08.06.2021
 * @version 1
 */

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
