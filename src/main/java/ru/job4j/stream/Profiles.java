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
                //1 Вариант (мой первоначальный)
                /*
                .sorted(Comparator.comparing(profile -> profile.getAddress().getCity()))
                .distinct()
                .map(el -> el.getAddress())
                .collect(Collectors.toList());
                */
                //2 Вариант (предложение от Стаса)
                /*
                .map(Profile::getAddress)
                .sorted((p1, p2) -> p1.getAddress().getCity().compareTo(p2.getAddress().getCity()))
                .distinct()
                .collect(Collectors.toList());
                */
                //3 Вариант
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
