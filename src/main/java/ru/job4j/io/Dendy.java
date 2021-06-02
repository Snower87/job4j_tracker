package ru.job4j.io;

import java.util.Scanner;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 2. Scanner и чтение числа из консоли. [179518#271504]
 * @Описание 1. Практика чтения из консоли через класс Scanner (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается ... ");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}
