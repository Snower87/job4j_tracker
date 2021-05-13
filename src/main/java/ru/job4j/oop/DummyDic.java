package ru.job4j.oop;

/**
 * @Раздел Блок 2. ООП / 1. Классы и объекты
 * @Задание 1.4. Вызов метода с возвращаемым типом. [167387#271547]
 * @Описание 1. Создайте класс ru.job4j.oop.DummyDic. Создайте в нем метод public String engToRus(String eng)
 * 2. Метод должен вернуть строчку "Неизвестное слово. " + eng.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 12.05.2021
 * @version 1
 */

public class DummyDic {
    /**
     * Переводит слово с англ. -> русский
     * @param eng новое слово для словаря
     * @return возвращает строку "Неизвестное слово. " + eng
     */
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictonary = new DummyDic();
        System.out.println(dictonary.engToRus("apple"));
        System.out.println(dictonary.engToRus("object"));
        System.out.println(dictonary.engToRus("link"));
    }
}
