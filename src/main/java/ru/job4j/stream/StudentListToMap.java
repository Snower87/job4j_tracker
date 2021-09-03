package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Класс-сервис StudentListToMap преобразовывает список List в мапу Map через потоки (Stream API)
 * 1) создание класса (#119) 2) добавил toMap с 3 пар-ами (#120)
 * @author Sergei Begletsov
 * @since 03.09.2021
 * @version 2
 */

public class StudentListToMap {
    /**
     * Преобразует список студентов в карту
     * @param list входной список студентов
     * @return карта/словарь, где ключ - имя студента, значение - объект студента
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                //1 Вариант как убрать повторы,
                //  но возникает ошибка при добавлении элемента по тому же ключу
                //.distinct()
                        .collect(Collectors.toMap(
                                key -> key.getSurname(),
                                value -> value,
                                //2 Вариант как убрать повторы - переопределить метод toMap,
                                //  в результате при повторе будет сохранено старое зн-е oldValue
                                //"нужно использовать перегруженный метод toMap с 3-я параметрами, где 3-им передается
                                // функция, позволяющая определить что делать с дубликатами"
                                (oldValue, newValue) -> oldValue
                        ));
    }
}
