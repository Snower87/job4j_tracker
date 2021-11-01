package ru.job4j.collection;

import java.util.HashSet;

/**
 /* Class UniqueText описывает 1) поисковой движок уникальных статей (#87)
 * @author Sergei Begletsov
 * @since 11.08.2021
 * @version 1
 */

public class UniqueText {
    /**
     * Метод проверяет на уникальность две строки
     * @param originText оригинальный текст
     * @param duplicateText текст с другого источника (сайта)
     * @return true - значит дубляж текста с перестановленными словами,
     *         false - текст уникальный.
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");

        HashSet<String> check = new HashSet<>();
        for (String str: origin) {
            check.add(str);
        }

        for (String search: text) {
            if (!check.contains(search)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
