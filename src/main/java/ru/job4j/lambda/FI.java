package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс FI практира работы с лямбда-выражениями 1) создание класса (#106)
 * @author Sergei Begletsov
 * @since 24.08.2021
 * @version 1
 */

public class FI {
    /**
     * Сортировка строк String по возрастанию
     * @param lists входной список под сортировку
     */
    public void sortAscByText(List<String> lists) {
        Comparator<String> compAscByText = (str1, str2) -> {
            return str1.compareTo(str2);
        };
        Collections.sort(lists, compAscByText);
    }

    /**
     * Сортировка строк String по убыванию
     * @param lists входной список под сортировку
     */
    public void sortDescByText(List<String> lists) {
        Comparator<String> compDescByText = (str1, str2) -> {
            return str2.compareTo(str1);
        };
        Collections.sort(lists, compDescByText);
    }

    /**
     * Сортировка объектов Attachment через внешний компаратор
     * @param lists входной список Attachment
     * @param comp входной компаратор
     */
    public void sortByTextWithComparator(List<Attachment> lists, Comparator<Attachment> comp) {
        Collections.sort(lists, comp);
    }

    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> compAscBySize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment att1, Attachment att2) {
                return att1.getSize() - att2.getSize();
            }
        };
        Arrays.sort(atts, compAscBySize);
        for (Attachment att: atts) {
            System.out.println(att);
        }

        Comparator<Attachment> compDescBySizeLambda = (att1, att2) -> {
            return att2.getSize() - att1.getSize();
        };
        Arrays.sort(atts, compDescBySizeLambda);
        for (Attachment att: atts) {
            System.out.println(att);
        }

        List<String> lists = Arrays.asList("a123", "a1", "a12", "a12345", "a1234");
        Comparator<String> compAscByTextLength = (att1, att2) -> {
            return att1.length() - att2.length();
        };
        Collections.sort(lists, compAscByTextLength);
        for (String list: lists) {
            System.out.println(list);
        }
    }
}
