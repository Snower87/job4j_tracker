package ru.job4j.tracker;

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
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 4.1. Разрыв зависимости StartUI от Scanner. [181778 #271509] (ver.3)
 * @Описание 1. Разорвите зависимость класса StartUI от класса Scanner.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 4.2. Статические методы. [181779#271510] (ver.4)
 * @Описание 1. Создайте статические методы createItem, replaceItem, deteleItem и тд.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание Переопределение метода toString() (ver.5)
 * @Описание 1. Исправление ошибки. Переопределение метода toString().
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 8. Реализация меню за счет шаблона стратегия. [181780# 271511] (ver.6)
 * @Описание 1. Произведите изменения проекта "Tracker" для различных действий. Добавьте использование UserAction.
 * 2. Реализуйте интерфейс UserAction используя шаблон "Стратегия".
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 9.1 Рефакторинг теста @Before @After. [33568#271501] (ver.7)
 * @Описание 1. Произведите рефакторинг проекта. Нам нужно заменить вывод в консоль на интрефейс Output.
 * Тесты на проверку вывода в консоль мы напишем в следующем уроке.
 * После рефакторинга запустите приложение через main и проверьте, что оно работает.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 9.2. Тесты вывода на консоль в StartUI. [33585#271502] (ver.8)
 * @Описание 1. Произвести тестирование классов FindAllAction, FindByNameAction, FindByIdAction.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 1. Обеспечить бесперебойную работу приложения Tracker. [789#271528] (ver.9)
 * @Описание 1. Произведите рефакторинг кода. Нужно будет обеспечить бесперебойную работу приложения Tracker (обработать
 * появление исключений). Добавьте обработку ситуаций: ввод несуществующего пункта меню, ввода строки вместо числа.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.05.2021
 * @version 9
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void createItem(Input input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public void showAllItems(Tracker tracker) {
        out.println("=== Show all item ====");
        Item[] items = tracker.findAll();
        for (Item item: items) {
            out.println(item.toString());
        }
    }

    public void editItem(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        Integer id = input.askInt("Enter id: ");
        String newValue = input.askStr("Enter new value item: ");
        Item newItem = new Item(newValue);
        if (tracker.replace(id, newItem)) {
            out.println("Edit operation id " + id + " was successful");
        } else {
            out.println("Edit operation id " + id + " - failed");
        }
    }

    public void deleteItem(Input input, Tracker tracker) {
        out.println("=== Delete Item ====");
        Integer id = input.askInt("Enter delete id: ");
        if (tracker.delete(id)) {
            out.println("Delete operation id " + id + " was successful");
        } else {
            out.println("Delete operation id " + id + " - failed");
        }
    }

    public void findItemId(Input input, Tracker tracker) {
        out.println("=== Find item by id ====");
        Integer id = input.askInt("Enter find id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Find item with " + id + " was successful.");
            out.println(item.toString());
        } else {
            out.println("Find item with " + id + " by id - failed");
        }
    }

    public void findItemName(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String key = input.askStr("Enter find key word: ");
        Item[] items = tracker.findByName(key);
        if (items.length != 0) {
            out.println("Find item by key word \"" + key + "\" was successful.");
            for (Item item: items) {
                out.println(item.toString());
            }
        } else {
            out.println("Find item by key word " + key + " - failed");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            //Вариант №1. Проверки корректного пункта меню
            //int select = input.askInt("Select: ", actions.length - 1);
            //Вариант №2. Проверки корректного пункта меню
            //            (Более простой)
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("------------------------");
        out.println("         MENU           ");
        out.println("------------------------");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
        
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input validate  = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] userActions =  {
                new CreateAction(output),
                new ShowAllAction(output),
                new EditItemAction(output),
                new DeleteItemAction(output),
                new FindItemIdAction(output),
                new FindItemNameAction(output),
                new ExitAction()
        };
        new StartUI(output).init(validate, tracker, userActions);
    }
}
