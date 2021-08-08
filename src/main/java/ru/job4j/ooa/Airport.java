package ru.job4j.ooa;

/**
 * @Раздел Блок 2. ООП / 6. ООА\П
 * @Задание 4. final. [#334073]
 * @Описание 1. Ниже представлен код, он содержит ряд ошибок компиляции. Вам необходимо его исправить, при этом сделать
 * таким образом:
 * - класс Airbus нельзя было наследовать;
 * - метод printCountEngine() должен выводить реальное количество двигателей, которое присуще той или иной
 * модели самолета. Поэтому если модель самолета A380 - количество двигателей должно равняться 4, для всех остальных
 * моделей - используем в качестве значения константу COUNT_ENGINE.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 08.08.2021
 * @version 1
 */

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        System.out.println();
        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
