package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 /* Класс-данных OrderConvert конвертирует заявки List -> в Map (#91)
 * @author Sergei Begletsov
 * @since 13.08.2021
 * @version 1
 */

public class OrderConvert {
    /**
     * Метод добавляет список всех заявок orders в коллекцию map
     * @param orders список заявок
     * @return возвращает коллекцию map (номер заявки, заявка)
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order: orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
