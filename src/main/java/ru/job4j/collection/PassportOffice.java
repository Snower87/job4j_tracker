package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 /* Класс PassportOffice сервис для работы Паспортного стола 1) добавляет пользователей (жителей), и получает их
    по номеру паспорта (#90)
 * @author Sergei Begletsov
 * @since 12.08.2021
 * @version 1
 */

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет пользователей в структуру данных
     * @param citizen новый пользователель (житель)
     * @return true - пользователь не найден, значит добавляем его,
     *         false - пользователь найден, не добавляем его
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод проверяет существует ли пользователь с таким паспортом
     * @param passport паспорт пользователя
     * @return если существует - то возвращает его,
     *         нет - то возвращает null.
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
