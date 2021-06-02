package ru.job4j.io;

import java.util.Scanner;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 2. Scanner и чтение числа из консоли. [179518#271504]
 * @Описание 1. Создайте класс ru.job4j.io.Matches с методом main. Код класса возьмите из задачи.
 * 2. В методе main добавьте цикл. Игра заканчивается, когда игрок забрал последние спички. В цикле нужно проверять
 *    количество оставшихся спичек.
 * 3. Сделайте ввод данных от пользователя. Сначала первый игрок вводит число от 1 до 3, потом второй и так далее.
 *    Когда игрок ввел цифру, нужно показать сколько спичек осталось на столе.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            /* Остальная логика игры. */
            count -= matches;
            System.out.println("Осталось спичек " + count);
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
