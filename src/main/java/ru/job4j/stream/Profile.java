package ru.job4j.stream;

/**
 * Класс-данных Profile содержит данные об апартаментах клиента
 * 1) создание класса (#117)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
