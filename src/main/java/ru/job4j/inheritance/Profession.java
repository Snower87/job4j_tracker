package ru.job4j.inheritance;

/**
 * @Раздел Блок 2. ООП / 2. Наследование
 * @Задание 3. Реализация профессий в коде. [6837#271558]
 * @Описание 1. Создайте базовый класс Profession - вынесите туда все общие поля (name, surname, education, birthday)
 * и методы (get методы на поля (public String getName())):
 * - Поля должны иметь модификатор private.
 * - Методы должны иметь модификаторы public.
 * 2. Создайте классы: Engineer, Doctor, унаследовав их от Profession.
 * 3. Создайте наследников от классов Engineer, Doctor.
 * 4. Добавьте новые поля в наследниках, а также методы. Эти поля и методы должны отображать особенность класса.
 * 5. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 17.05.2021
 * @version 1
 */

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
