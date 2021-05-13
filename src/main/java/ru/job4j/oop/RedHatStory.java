package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.6. Взаимодействие объектов. [166087#271546]
 * @Описание 1. Практика по взаимодействию объектов разных классов (по описанию к задаче). На примере сказки
 * "красная шапочка".
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 13.05.2021
 * @version 1
 */

public class RedHatStory {
    public static class Girl {
        public void help(Pioneer pioneer) {
        }
    }

    public static class Wolf {
        public void eat(Girl girl) {
        }
    }

    public static class Pioneer {
        public void kill(Wolf wolf) {
        }
    }

    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
