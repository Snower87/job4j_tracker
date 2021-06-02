package ru.job4j.tracker;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3. Интерфейс Input. [181092#271505]
 * @Описание 1. Практика создания классов на базе интерфейсов (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 1
 */

public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
