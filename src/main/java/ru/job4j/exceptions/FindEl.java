package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.4. Пользовательские исключения. [219367#271524]
 * @Описание 1. Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 * 2. Допишите метод поиска индекса элемента в строковом массиве nt indexOf(String[] value, String key).
 * 3. Если элемента нет, то нужно выкинуть исключение ElementNotFoundException. В сигнатуре метода объявите это исключение.
 * 4. Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 1
 */

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Keyword index not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = new String[] {"Сидела", " кукушка", " на", " ветке ", "№1", " и", " читала", " строку ", "№2",
                                     " в", " книге ", "№3"};
        try {
            int indexKeyword = indexOf(str, "№1");
            System.out.println(indexKeyword);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
