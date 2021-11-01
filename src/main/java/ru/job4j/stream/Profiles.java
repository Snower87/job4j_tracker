package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс-сервис Profile содержит профили всех клиентов
 * 1) создание класса (#117) 2) добавил метода collectUnique - собирает уникальные адреса (#118)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 2
 */

public class Profiles {
    /**
     * Получить список адресов всех клиентов
     * @param profiles входной список профилей клиентов (с адресами)
     * @return список адресов всех клиентов
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                            .map(profile -> profile.getAddress())
                            .collect(Collectors.toList());
    }

    /**
     * Получить список уникальных адресов всех клиентов
     * @param profiles входной список профилей клиентов (с адресами)
     * @return список адресов всех клиентов
     */
    public static List<Address> collectUnique(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
