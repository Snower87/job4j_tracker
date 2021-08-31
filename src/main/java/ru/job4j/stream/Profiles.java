package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс-сервис Profile содержит профили всех клиентов
 * 1) создание класса (#117)
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
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
}
