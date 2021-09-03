package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Класс-сервис StudentListToMap преобразовывает список List в мапу Map через потоки (Stream API)
 * 1) создание класса (#119)
 * @author Sergei Begletsov
 * @since 03.09.2021
 * @version 1
 */

public class StudentListToMap {
    /**
     * Преобразует список студентов в карту
     * @param list входной список студентов
     * @return карта/словарь, где ключ - имя студента, значение - объект студента
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                        .distinct()
                        .collect(Collectors.toMap(
                                //1 Вариант
                                key -> key.getSurname(),
                                value -> value
                                //2 Вариант
                                //Student::getSurname,
                                //student -> student
                        ));
    }
}
