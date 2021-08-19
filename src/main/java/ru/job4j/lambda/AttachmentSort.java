package ru.job4j.lambda;

import java.util.*;

/**
 * Class AttachmentSort практира работы с анонимными классами 1) создание класса (#102)
 * @author Sergei Begletsov
 * @since 19.08.2021
 * @version 1
 */

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        //Анонимный класс на базе интерфейса java.util.Comparator,
        //реализующий метод compare(Object obj1, Object obj2)
        //БЕЗ ОБОБЩЕНИЯ ТИПОВ с сортировкой << по возрастанию >>
        Comparator comparatorIncSize = new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                Attachment left = (Attachment) obj1;
                Attachment right = (Attachment) obj2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparatorIncSize); //Вариант 1
        Collections.sort(attachments, comparatorIncSize); //Вариант 2
        System.out.println(attachments);

        //Анонимный класс на базе интерфейса java.util.Comparator,
        //реализующий метод compare(Object obj1, Object obj2)
        //с обощнением по типу Attachment и сортировкой << по убыванию >>
        Comparator<Attachment> comparatorDecSize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj2.getSize() - obj1.getSize();
            }
        };
        attachments.sort(comparatorDecSize);
        System.out.println(attachments);

        //Анонимный класс на базе класса java.util.ArrayList,
        //реализующий метод add(Object obj)
        //с обобщением по типу Integer выводом на консоль сообщения о добавлении элемента
        ArrayList<Integer> arrayList = new ArrayList() {
            @Override
            public boolean add(Object obj) {
                System.out.println("Add a new element to list: " + obj);
                return super.add(obj);
            }
        };
        arrayList.add(100500);

        //Решение задания:
        //Сортировка элементов класса Attachment << по возрастанию >> поля (name)
        Comparator<Attachment> comparatorAscByName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj1.getName().compareTo(obj2.getName());
            }
        };
        attachments.sort(comparatorAscByName);
        System.out.println(attachments);

        //Сортировка элементов класса Attachment << по убыванию >> поля (name)
        Comparator<Attachment> comparatorDescByName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj2.getName().compareTo(obj1.getName());
            }
        };
        attachments.sort(comparatorDescByName);
        System.out.println(attachments);
    }
}
