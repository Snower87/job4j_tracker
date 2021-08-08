package ru.job4j.ooa;

/**
 * @Раздел Блок 2. ООП / 6. ООА\П
 * @Задание 4. final. [#334073]
 * @Описание 1. Практика работы с модификатором final (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 08.08.2021
 * @version 1
 */

public class FinalUsage {
    public static void main(String[] args) {
        final UserPetr FIRST_USER = new UserPetr("finalPetr", 33);
        System.out.println("Вывод в консоль до изменения.");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Petr Arsentev");
        FIRST_USER.setAge(33);
        System.out.println("Вывод в консоль после изменения.");
        System.out.println(FIRST_USER);
    }
}
