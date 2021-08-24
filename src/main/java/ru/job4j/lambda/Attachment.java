package ru.job4j.lambda;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment that = (Attachment) o;
        return size == that.size &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
