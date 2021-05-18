package ru.job4j.inheritance;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 4. Переопределение методов родительского класса. JSON-формат. [174890#271555] (ver.1)
 * @Описание 1. Создайте класс JSONReport. Он должен наследоваться от TextReport.
 * 2. Переопределите методы generate. Этот метод должен вернуть шаблон в следующем формате.
 * {
 *   "name" : "name",
 *   "body" : "body"
 * }
 * Для переноса строки используйте метод System.lineSeparator().
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 5. Аннотация @Override. [174891#271556] (ver.2)
 * @Описание 1. Вернитесь к классам HtmlReport, JSONReport.
 * 2. Добавьте в них аннотации @Override.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 18.05.2021
 * @version 2
 */

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        System.out.println("JSON-format:");
        String separatorBracketOpen = "{";
        String separatorBracketClose = "}";
        String separatorColon = ":";
        String separatorBraceOpen = "[";
        String separatorBraceClose = "]";
        String separatorComma = ",";
        String separatorDot = ".";

        return separatorBracketOpen + System.lineSeparator() +
                "\tname: " + name + separatorComma + System.lineSeparator() +
                "\tbody: " + body + System.lineSeparator() +
                separatorBracketClose;
    }
}
