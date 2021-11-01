package ru.job4j.io;

import java.util.Scanner;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 2. Scanner и чтение числа из консоли. [179518#271504]
 * @Описание 1. Альтернативный вариант игры "11" (из предыдущего репозитория).
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class MatchesVer2 {
    private String name;
    private int numMatches;

    /**
     * Конструктор с именем игрока
     * @param name имя игрока
     */
    public MatchesVer2(String name) {
        this.name = name;
        this.numMatches = 0;
    }

    /**
     * Метод получает имя игрока
     * @return имя игрока.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод получает кол-во спичек у игрока
     * @return кол-во спичек
     */
    public int getNumMatches() {
        return numMatches;
    }

    /**
     * Метод увеличивает кол-во спичек у игрока
     */
    public void incNumMatches(int numMatches) {
        this.numMatches += numMatches;
    }

    /**
     * Метод проверки введеного пользователем числа в диапазоне from - to
     * @param value проверяемое значение пользователя
     * @param from начальный диапазон чисел
     * @param to конечный диапазон чисел
     * @return true - если число находится в диапазоне [from, to], false - если за пределами
     */
    public boolean isInRange(int value, int from, int to) {
        return (value >= from && value <= to);
    }

    /**
     * Метод проверяет победил/или нет пользователь
     * @param user другой игрок, с кем происходит сравнение
     * @return true - значит игрок который вызвал данный метод победил, false - если не победил
     */
    public boolean isWin(MatchesVer2 user)  {
        boolean endGame = false;
        int numMatchesAtTable = this.numMatches + user.numMatches;
        if (numMatchesAtTable >= 11) {
            System.out.println("Победил Игрок - " + this.name);
            System.out.println("С количеством спичек: " + this.numMatches);
            System.out.println("Проиграл Игрок - " + user.name);
            System.out.println("Его количество спичек: " + user.numMatches);
            System.out.println("Игра окончена");
            endGame = true;
        } else {
            System.out.println("Осталось спичек на столе: " + (11 - numMatchesAtTable));
        }
        return endGame;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите названия игроков:");
        System.out.println("Игрок 1. Как вас зовут?");
        String nameUser1 = input.nextLine();
        System.out.println("Игрок 2. Как вас зовут?");
        String nameUser2 = input.nextLine();
        System.out.println("Добро пожаловать на игру \"11 спичек\"");
        MatchesVer2 user1 = new MatchesVer2(nameUser1);
        MatchesVer2 user2 = new MatchesVer2(nameUser2);

        while (user1.getNumMatches() + user2.getNumMatches() < 11 &&
                user1.getNumMatches() + user2.getNumMatches() >= 0) {
            int takeMatchesUser1 = 0;
            while (!user1.isInRange(takeMatchesUser1, 1, 3)) {
                System.out.println("Ход игрока 1 - " + user1.getName() + ". Сколько возьмете?");
                takeMatchesUser1 = Integer.parseInt(input.nextLine());
            }
            user1.incNumMatches(takeMatchesUser1);

            if (user1.isWin(user2)) {
                break;
            }

            int takeMatchesUser2 = 0;
            while (!user2.isInRange(takeMatchesUser2, 1, 3)) {
                System.out.println("Ход игрока 2 - " + user2.getName() + ". Сколько возьмете?");
                takeMatchesUser2 = Integer.parseInt(input.nextLine());
            }
            user2.incNumMatches(takeMatchesUser2);

            if (user2.isWin(user1)) {
                break;
            }
        }
    }
}
