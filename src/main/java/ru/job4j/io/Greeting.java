package ru.job4j.io;

import java.util.Scanner;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 1. Чтение из консоли. Класс Scanner. [179514#271503]
 * @Описание 1. Практика чтения из консоли через класс Scanner (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать! Как вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", мы рады вас видеть!");
    }
}
