package ru.job4j.exceptions;

/**
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.4. Пользовательские исключения. [219367#271524] (ver.1)
 * @Описание 1. Создайте класс ru.job4j.ex.ElementNotFoundException. Класс должен наследоваться от java.lang.Exception.
 * 2. Допишите метод поиска индекса элемента в строковом массиве nt indexOf(String[] value, String key).
 * 3. Если элемента нет, то нужно выкинуть исключение ElementNotFoundException. В сигнатуре метода объявите это исключение.
 * 4. Добавьте метод main, и в нем вызовите метод indexOf. В методе main используйте конструкцию try-catch.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 5. Исключения
 * @Задание 0.5. Иерархия исключений и множественный catch. [219368#271525] (ver.2)
 * @Описание 1. Работа с исключениями (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 14.06.2021
 * @version 2
 */

public class FindEl {
    /**
     * Метод indexOf - этот метод проверяет, что в списке есть ключ шаблона сообщения
     * @param value список сообщений
     * @param key искомый ключ
     * @return индекс найденного ключа
     * @throws ElementNotFoundException выкидавает, если ключ не найден
     */
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

    /**
     * Метод sent отправляет сообщение, если ключ не входит в ключи запрещенных ключей
     * @param value входной ключ
     * @param abuses список запрещенных ключей
     * @return true - если не содержит запрещенных ключей
     * @throws ElementAbuseException выкидывает, если запрещенный ключ найден
     */
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (int index = 0; index < abuses.length; index++) {
            if (value.equals(abuses[index])) {
                throw new ElementAbuseException("Abuse is found");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] str = new String[] {"Сидела", " кукушка", " на", " ветке ", "№1", " и", " читала", " строку ", "№2",
                                     " в", " книге ", "№3"};
        String keyWord = str[3];
        String[] abuses = new String[] {"#33", "str", "test_init", "№1"};
        process(str, keyWord, abuses);
    }
}
