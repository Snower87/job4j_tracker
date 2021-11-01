package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.6. Взаимодействие объектов. [166087#271546]
 * @Описание 1. По аналогии с описанным заданием сделать классы для описания сказки колобок.
 * 2. Создайте 4 класса Ball, Hare, Wolf, Fox.
 * 3. В каждом классе должен быть метод public void tryEat(Ball ball).
 * 4. Создайте класс BallStory с методом main и опишите историю через объекты.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 1
 */

public class BallStory {
    public static class Ball {
        public void run() {
        }
    }

    public static class Fox {
        public void tryEat(Ball ball) {
        }
    }

    public static class Hare {
        public void tryEat(Ball ball) {
        }
    }

    public static class Wolf {
        public void tryEat(Ball ball) {
        }
    }

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(kolobok);
        kolobok.run();
        wolf.tryEat(kolobok);
        kolobok.run();
        fox.tryEat(kolobok);
        kolobok.run();
    }
}
