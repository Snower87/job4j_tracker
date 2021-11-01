package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 /* Класс UsageMap практика работы с коллекциями HashMap (#89)
 * @author Sergei Begletsov
 * @since 12.08.2021
 * @version 1
 */

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("sergeibezk@yandex.ru", "Sergei Bezkoritov");
        map.put("vovapopov@yandex.ru", "Vladimir Popov");
        map.put("ivnpoddubnii@yandex.ru", "Ivan Poddubnii");
        map.put("parsentev@yandex.ru", "Petr Arsentev2");

        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();

        map.remove("parsentev@yandex.ru");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();

        HashMap<String, String> postAndName = new HashMap<>();
        postAndName.put("aaa@yandex.ru", "Халкаев Азамир Азизович");
        postAndName.put("about@mail.ru", "mail.ru");
        postAndName.put("petrov@uber.ru", "Петров Иван Сергеевич");
        postAndName.put("amazon@hotmail.ru", "Bernanke Fiezeph Knauht");

        for (String key: postAndName.keySet()) {
            System.out.println(postAndName.get(key));
        }
    }
}
