package ru.job4j.condition;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 3. Перегрузить метод max для трех чисел. [122644#271541]
 * @Описание 1. В классе ru.job4j.condition.Max из задания 4.2. Максимум из двух чисел добавить перегруженный метод max
 * для трех и четырех чисел. Постарайтесь, аналогично, примеру из задания переиспользовать уже существующие методы.
 * 2. Напишите тесты. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.05.2021
 * @version 1
 */

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int numb1, int numb2, int numb3) {
        return max(
                numb1,
                max(numb2, numb3)
        );
    }

    public static int max(int numb1, int numb2, int numb3, int numb4) {
        return max(
                numb1,
                max(numb2, numb3, numb4)
        );
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }
}
