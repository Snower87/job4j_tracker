package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 5. Tracker - хранилище. [396#271567] (ver.1)
 * @Описание 1. Добавьте недостающие методы в класс Tracker. В классе Tracker должны быть методы:
 * - добавление заявок - public Item add(Item item);
 * - получение списка всех заявок - public Item[] findAll();
 * - получение списка по имени - public Item[] findByName(String key);
 * - получение заявки по id - public Item findById(int id);
 * 2. Создайте класс ru.job4j.tracker.StartUI. В нем создайте метод main.
 * - Внутри метода main создайте объект Tracker. Вызовите у него метод add с объектом Item.
 * - Вызовите метод findById и найденный Item выведите на консоль.
 * 3. Напишите тесты. Протестируйте код в junit.
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 6. Метод замены заявки. Tracker.replace. [211748#271564] (ver.2)
 * @Описание 1. Реализуйте метод Tracker.replace, используя метод indexOf. Причем вызов indexOf должен быть один.
 * 2. Проверьте работу метода replace с помощью тест-метода. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 7. Метод удаления заявки Tracker.delete. [211749#271565] (ver.3)
 * @Описание 1. Реализуйте метод Tracker.delete, используя indexOf. Причем вызов indexOf должен быть один.
 * Метод delete возвращает true, если заявление удалено или false, если index не найдет по id.
 * 2. Добавьте тест-метод, проверяющий удаление. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 3
 */

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Метод возвращает index по id
     * @param id номер заявки
     * @return
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Метод поиска всех не нулевых заявок в хранилище
     */
    public Item[] findAll() {
        //Вариант №1
        //Item[] copyItems = new Item[items.length];
        //copyItems = Arrays.copyOf(items, this.size);
        //return copyItems;
        //Вариант №2
        return Arrays.copyOf(items, size);
    }

    /**
     * Метод поиска заявки в хранилище по ключу
     * @param key номер заявки
     */
    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size];
        int copySize = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (key.equals(item.getName())) {
                copyItems[copySize] = item;
                copySize++;
            }
        }
        return Arrays.copyOf(copyItems, copySize);
    }

    /**
     * Метод поиска заявки в хранилище
     * @param id номер заявки
     */
    public Item findById(int id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод генерирует номер id
     */
    private String generateId() {
        return String.valueOf(ids++);
    }

    /**
     * Метод замены старого итема на новый по номеру id (ключу)
     * @param id номер заявки
     * @param item новый итем
     * @return true - замена успешно прошла, false - не произошла
     */
    public boolean replace(int id, Item item) {
        boolean res = false;
        //1. Находим индекс ячейки по id
        int index = indexOf(id);
        // Если индекс найден, то переставляем заявку (меняем)
        if (index != -1) {
            //2. Сохраняю старый id заявки
            //item.setId(items[index].getId()); //было
            item.setId(id);
            //3. Записываю в найденную ячейку объект item
            items[index] = item;
            //4. Выставляю, что замена произошла
            res = true;
        }
        return res;
    }

    /**
     * Метод удаления итема по номеру id
     * @param id номер заявки
     * @return true - удаление прошло успешно, false - не произошло
     */
    public boolean delete(int id) {
        boolean res = false;
        //1. Находим индекс удаляемой ячейки по id
        int index = indexOf(id);
        // Если индекс найден, удаляю элемент по сдвигом
        if (index != -1) {
            //2. Задаю входные параметры:
            int startPos = index + 1;
            int distPos = index;
            int sizePos = size - index;
            //3. Удаление со смещением массива вверх
            System.arraycopy(items, startPos, items, distPos, sizePos);
            //4. Сдвиг последнего элемента в items
            items[size - 1] = null;
            size--;
            res = true;
        }
        return res;
    }
}