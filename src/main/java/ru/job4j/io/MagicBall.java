package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 1. Чтение из консоли. Класс Scanner. [179514#271503]
 * @Описание 1. Создайте класс ru.job4j.io.MagicBall.
 * 2. Создайте в нем метод main. В нем попросите пользователя ввести закрытый вопрос. Это вопрос на который можно
 * ответить либо "да", либо "нет".
 * - System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
 * Например, "Будет ли завтра дождь?"
 * 3. В методе main должен быть объект Scanner для ввода вопроса от пользователя.
 * 4. Через класс Random сгенерируйте число от 0 до 3. Ниже приведён код, как это можно сделать.
 * import java.util.Random;
 * ....
 * int answer = new Random().nextInt(3);
 * Если ответ равен 0, то на консоль нужно вывести "Да". Если ответ равен 1, то на консоль нужно вывести "Нет".
 * Во всех остальных случаях напечатать - "Может быть".
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
