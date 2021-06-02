package ru.job4j.poly;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3. Интерфейс Input. [181092#271505]
 * @Описание 1. Создайте интерфейс транспорт ru.job4j.poly.Transport.
 * Этот интерфейс будет определять любой вид транспорта.
 * 2. В интерфейсе объявите три метода: ехать (без параметров, без возвращаемого типа),
 * пассажиры (принимает число пассажиров, без возвращаемого типа), заправить (принимает кол-во топлива, возвращает цену).
 * 3. Реализуйте этот интерфейс в классе ru.job4j.poly.Bus.
 * Внутри методов напишите минимально требуемый код.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Реализация метода move() в классе Bus");
    }

    @Override
    public void passengers() {
        System.out.println("Реализация метода passengers() в классе Bus");
    }

    @Override
    public float costFuel(float litres) {
        System.out.println("Стоимость 1 литра = 3.44 шиллинга");
        System.out.println("Стоимость заправки:" + (float) (3.44 * litres));
        return (float) (3.44 * litres);
    }
}