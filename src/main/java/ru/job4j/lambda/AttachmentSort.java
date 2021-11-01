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

        Comparator comparatorIncSize = new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                Attachment left = (Attachment) obj1;
                Attachment right = (Attachment) obj2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparatorIncSize);
        Collections.sort(attachments, comparatorIncSize);
        System.out.println(attachments);

        Comparator<Attachment> comparatorDecSize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj2.getSize() - obj1.getSize();
            }
        };
        attachments.sort(comparatorDecSize);
        System.out.println(attachments);

        ArrayList<Integer> arrayList = new ArrayList() {
            @Override
            public boolean add(Object obj) {
                System.out.println("Add a new element to list: " + obj);
                return super.add(obj);
            }
        };
        arrayList.add(100500);

        Comparator<Attachment> comparatorAscByName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj1.getName().compareTo(obj2.getName());
            }
        };
        attachments.sort(comparatorAscByName);
        System.out.println(attachments);

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
