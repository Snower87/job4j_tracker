package ru.job4j.tracker;

import java.util.Scanner;

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
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 2.1. Реализация класса StartUI. [784#271514] (ver.2)
 * @Описание 1. Доработайте класс ru.job4j.tracker.StartUI.
 * 2. Программа должна выводить меню. Каждый пункт меню должен работать.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * Примечание:
 * 1. В случае вывода массивов, массив нужно выводить поэлементно
 * 2. Для методов replace/delete сделать вывод в виде:
 * if (tracker.replace(id, newItem)) {
 *     // вывод об успешности операции
 * } else {
 *     // вывод об ошибке
 * }
 * 3. Объяснение:
 * Пункт меню 1 - Show all items:
 * 1.1. У объекта tracker вызвать метод findAll();
 * 1.2. Результат вызова поместить в переменную - это будет массив элементов класса Item;
 * 1.3. Вывести в консоль все элементы массива, выполнить в соответствии с примечанием 1.
 *
 * Пункт меню 2 - Edit item:
 * 2.1. Получить id заявки, которую мы будем изменять, через объект scanner;
 * 2.2. Получить имя заявки на которую мы будем заменять через объект scanner;
 * 2.3. Создаем объект класса Item, у которого устанавливаем имя из пункта 2.2;
 * 2.4. Вызвать метод replace у объекта tracker, в него передать id из пункта 2.1 и объект класса Item из пункта 2.3;
 * 2.5. Результат работы метода replace необходимо валидировать, для этого учтите рекомендацию из примечания 2.
 *
 * Пункт 3 - Delete item:
 * 3.1. Получить id заявки, которую мы будем удалять, через объект scanner;
 * 3.2. Вызвать метод delete у объекта tracker, в него передать id из пункта 3.1;
 * 3.3. Результат работы метода delete необходимо валидировать, для этого учтите рекомендацию из примечания 2.
 *
 * Пункт 4 - Find item by Id:
 * 4.1. Получить id заявки, которую мы будем искать в хранилище, через объект scanner;
 * 4.2. Вызвать метод findById() у объекта tracker, в него передать id из пункта 4.1;
 * 4.3. Результат вызова метода поместить в переменную - это будет объект класса Item;
 * 4.4. Результат работы метода findById() необходимо валидировать, поскольку метод может вернуть null;
 * 4.5. Если заявка не равна null -  мы печатаем в консоль заявку, иначе - фразу: "Заявка с таким id не найдена".
 *
 * Пункт 5 - Find items by name:
 * 5.1. Получить имя заявок, которые мы будем искать, через объект scanner;
 * 5.2. Вызвать метод findByName() у объекта tracker, в него передать имя из пункта 1;
 * 5.3. Результат вызова метода поместить в переменную - это будет массив объектов класса Item;
 * 5.4. Результат работы метода findByName() необходимо валидировать, поскольку метод может вернуть пустой массив;
 * 5.5. Если длина массива больше 0 - выводим массив в соответствии с примечанием 1, иначе фразу - "Заявки с таким именем
 *      не найдены".
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 2
 */

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all item ====");
                Item[] items = tracker.findAll();
                for (Item item: items) {
                    System.out.print("id: " + item.getId() + ", ");
                    System.out.println("name: " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                Integer id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new value item: ");
                String newValue = scanner.nextLine();
                Item newItem = new Item(newValue);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Edit operation id " + id + " was successful");
                } else {
                    System.out.println("Edit operation id " + id + " - failed");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter delete id: ");
                Integer id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Delete operation id " + id + " was successful");
                } else {
                    System.out.println("Delete operation id " + id + " - failed");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.print("Enter find id: ");
                Integer id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Find item with " + id + " was successful.");
                    System.out.print("id: " + item.getId() + ", ");
                    System.out.println("name: " + item.getName());
                } else {
                    System.out.println("Find item with " + id + " by id - failed");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter find key word: ");
                String key = scanner.nextLine();
                Item[] items = tracker.findByName(key);
                if (items.length != 0) {
                    System.out.println("Find item by key word \"" + key + "\" was successful.");
                    for (Item item: items) {
                        System.out.print("id: " + item.getId() + ", ");
                        System.out.println("name: " + item.getName());
                    }
                } else {
                    System.out.println("Find item by key word " + key + " - failed");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("------------------------");
        System.out.println("         MENU           ");
        System.out.println("------------------------");
        // добавить остальные пункты меню.
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
