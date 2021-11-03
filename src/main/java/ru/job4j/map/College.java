package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Класс-сервис College
 * 1) создание класса (#124) 2) добавил методы findByAccount, findBySubjectName, реализовав их через
 * оболочку Optional, чтобы избавиться от ошибки NPE (#139) 3) удалил старые методы (#142)
 * @author Sergei Begletsov
 * @since 07.09.2021
 * @version 3
 */

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
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
}
