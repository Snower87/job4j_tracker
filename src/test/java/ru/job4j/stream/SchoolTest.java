package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenCollectStudentClass10A() {
        //1. Входные данные, список учеников школы
        List<Student> listStudent = Arrays.asList(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Gena", 78),
                new Student("Damir", 69),
                new Student("Jora", 60),
                new Student("Kirill", 49),
                new Student("Leonid", 46),
                new Student("Petya", 35),
                new Student("Sasha", 32)
        );
        School sc = new School();
        //2. Получаем список учеников класса А:
        Predicate<Student> compClassA = (student -> student.getScore() >= 70);
        List<Student> studentClassA = sc.collect(listStudent, compClassA);
        //3. Ожидаемый результат
        List<Student> expectedStudent = Arrays.asList(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Gena", 78)
        );
        assertEquals(expectedStudent, studentClassA);
    }

    @Test
    public void whenCollectStudentClass10B() {
        //1. Входные данные, список учеников школы
        List<Student> listStudent = Arrays.asList(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Gena", 78),
                new Student("Damir", 69),
                new Student("Jora", 60),
                new Student("Kirill", 49),
                new Student("Leonid", 46),
                new Student("Petya", 35),
                new Student("Sasha", 32)
        );
        School sc = new School();
        //2. Получаем список учеников класса B:
        Predicate<Student> compClassB = (student -> student.getScore() >= 50 & student.getScore() < 70);
        List<Student> studentClassB = sc.collect(listStudent, compClassB);
        //3. Ожидаемый результат
        List<Student> expectedStudent = Arrays.asList(
                new Student("Damir", 69),
                new Student("Jora", 60)
        );
        assertEquals(expectedStudent, studentClassB);
    }

    @Test
    public void whenCollectStudentClass10C() {
        //1. Входные данные, список учеников школы
        List<Student> listStudent = Arrays.asList(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Gena", 78),
                new Student("Damir", 69),
                new Student("Jora", 60),
                new Student("Kirill", 49),
                new Student("Leonid", 46),
                new Student("Petya", 35),
                new Student("Sasha", 32)
        );
        School sc = new School();
        //2. Получаем список учеников класса C:
        Predicate<Student> compClassC = (student -> student.getScore() < 50);
        List<Student> studentClassC = sc.collect(listStudent, compClassC);
        //3. Ожидаемый результат
        List<Student> expectedStudent = Arrays.asList(
                new Student("Kirill", 49),
                new Student("Leonid", 46),
                new Student("Petya", 35),
                new Student("Sasha", 32)
        );
        assertEquals(expectedStudent, studentClassC);
    }

    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname4", 40),
                new Student("Surname5", 50),
                new Student("Surname7", 70),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = student -> (student.getScore() >= 70) & (student.getScore() <= 100);
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname7", 70));
        expected.add(new Student("Surname9", 90));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student("Surname2", 20),
                new Student("Surname3", 30),
                new Student("Surname5", 50),
                new Student("Surname6", 60),
                new Student("Surname8", 80)
        );
        School sc = new School();
        Predicate<Student> pr = student -> (student.getScore() >= 50) & (student.getScore() < 70);
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname5", 50));
        expected.add(new Student("Surname6", 60));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname3", 30),
                new Student("Surname4", 40),
                new Student("Surname6", 60),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = student -> (student.getScore() > 0) & (student.getScore() < 50);
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname1", 10));
        expected.add(new Student("Surname3", 30));
        expected.add(new Student("Surname4", 40));
        assertThat(rsl, is(expected));
    }
}