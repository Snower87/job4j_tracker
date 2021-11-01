package ru.job4j.map;

import java.util.Map;
import java.util.Set;

/**
 * Класс-сервис College
 * 1) создание класса (#124)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 1
 */

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Поиска студента по аккаунту
     * @param account аккаунт студента
     * @return возвращает найденного студента или null
     */
    public Student findByAccount(String account) {
        return students.keySet().stream()
                .filter(student -> student.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск предмета по аккаунту и имени предмета
     * @param account аккаунт студента
     * @param name имени предмета
     * @return возвращает найденного предмет или null
     */
    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            return students.get(a).stream()
                    .filter(subject -> subject.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.getScore());
    }
}
