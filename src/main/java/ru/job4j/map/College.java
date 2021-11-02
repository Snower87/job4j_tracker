package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Класс-сервис College
 * 1) создание класса (#124) 2) добавил методы findByAccount, findBySubjectName, реализовав их через
 * оболочку Optional, чтобы избавиться от ошибки NPE (#139)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 2
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
    public Student findByAccount1(String account) {
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
    public Subject findBySubjectName1(String account, String name) {
        Student a = findByAccount1(account);
        if (a != null) {
            return students.get(a).stream()
                    .filter(subject -> subject.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Поиска студента по аккаунту (через Optional)
     * @param account аккаунт студента
     * @return Optional из студента или null
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s: students.keySet()) {
            if (account.equals(s.getAccount())) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

    /**
     * Поиск предмета по аккаунту и имени предмета (через Optional)
     * @param account аккаунт студента
     * @param name имени предмета
     * @return Optional из предмета или null
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> s = findByAccount(account);
        if (s.isPresent()) {
            Set<Subject> subjects = students.get(s.get());
            for (Subject subj : subjects) {
                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    break;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount1("000001");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName1("000001", "English");
        System.out.println("Оценка по найденному предмету: " + english.getScore());
    }
}
