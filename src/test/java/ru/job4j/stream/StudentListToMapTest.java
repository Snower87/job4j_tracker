package ru.job4j.stream;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class StudentListToMapTest {
    @Test
    public void whenConvert10StudentListTo10Map() {
        List<Student> studentList = List.of(
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

        Map<String, Student> expectedList = new LinkedHashMap<>();
        for (int i = 0; i < studentList.size(); i++) {
            expectedList.put(studentList.get(i).getSurname(), studentList.get(i));
        }

        assertEquals(expectedList, StudentListToMap.convert(studentList));
    }

    @Test
    public void whenConvert3StudentWith1DublicateListTo3Map() {
        List<Student> studentList = List.of(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Anton", 12)
        );

        Map<String, Student> expectedList = new LinkedHashMap<>();
        for (int i = 0; i < studentList.size() - 1; i++) {
            expectedList.put(studentList.get(i).getSurname(), studentList.get(i));
        }

        assertEquals(expectedList, StudentListToMap.convert(studentList));
    }

    @Test
    public void whenConvert3StudentWith3DublicateListTo3Map() {
        List<Student> studentList = List.of(
                new Student("Anton", 98),
                new Student("Vova", 82),
                new Student("Basilyu", 80),
                new Student("Anton", 33),
                new Student("Vova", 33),
                new Student("Anton", 33)
        );

        Map<String, Student> expectedList = new LinkedHashMap<>();
        for (int i = 0; i < studentList.size() - 3; i++) {
            expectedList.put(studentList.get(i).getSurname(), studentList.get(i));
        }

        assertEquals(expectedList, StudentListToMap.convert(studentList));
    }
}