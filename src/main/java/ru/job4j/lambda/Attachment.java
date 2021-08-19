package ru.job4j.lambda;

/**
 * Class Attachment класс-данных 1) создан для работы с анонимными классами в AttachmentSort (#102)
 * @author Sergei Begletsov
 * @since 19.08.2021
 * @version 1
 */

public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
