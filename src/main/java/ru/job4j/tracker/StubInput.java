package ru.job4j.tracker;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3. Интерфейс Input. [181092#271505]
 * @Описание 1. Практика создания классов на базе интерфейсов (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 5. Input и полиморфизм. [181094#271507]
 * @Описание 1. Добавление и реализация методов, имитирующих ввод пользователем данных.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 02.06.2021
 * @version 2
 */

public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }
}
