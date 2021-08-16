package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    //Тесты, проверяющие отдельное поведение компараторов
    //1. Сортировка <<по имени>>
    //1.1 Сортировка по возрастанию - сравнивается 1-ый объект со 2-м
    @Test
    public void whenCompatorByNameIncrease() {
        Comparator<Job> cmpNameIncrease = new JobAscByName();
        int rsl = cmpNameIncrease.compare(
                new Job("AAAAA", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, lessThan(0)); //job1.name - job2.name < 0 --> (-1)
    }

    //1.2 Сортировка по убыванию - сравнивается 2-ой объект со 1-м
    @Test
    public void whenCompatorByNameDecrease() {
        Comparator<Job> cmpNameDecrease = new JobDescByName();
        int rsl = cmpNameDecrease.compare(
                new Job("AAAAA", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, greaterThan(0)); //job2.name - job1.name > 0 --> (+1)
    }

    //1.3 Сортировка по убыванию - 1-ый объект = 2-му объекту
    @Test
    public void whenCompatorByNameDecreaseAndObject1Equals2() {
        Comparator<Job> cmpNameDecrease = new JobDescByName();
        int rsl = cmpNameDecrease.compare(
                new Job("BBBBB", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, is(0)); //job2.name - job1.name = 0 --> (0)
    }


    //2. Сортировка <<по приоритету>>
    //2.1 Сортировка по возрастанию
    @Test
    public void whenCompatorByPriorityIncrease() {
        Comparator<Job> cmpPriorityIncrease = new JobAscByPriority();
        int rsl = cmpPriorityIncrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 66)
        );
        assertThat(rsl, lessThan(0)); //job1.prior - job2.prior = -33 < 0 --> (-1)
    }

    //2.2 Сортировка по убыванию
    @Test
    public void whenCompatorByPriorityDecrease() {
        Comparator<Job> cmpPriorityDecrease = new JobDescByPriority();
        int rsl = cmpPriorityDecrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 66)
        );
        assertThat(rsl, greaterThan(0)); //job2.prior - job1.prior = 33 > 0 --> (+1)
    }

    //2.3 Сортировка по убыванию - 1-ый объект = 2-му объекту
    @Test
    public void whenCompatorByPriorityDecreaseAndObject1Equals2() {
        Comparator<Job> cmpPriorityDecrease = new JobDescByPriority();
        int rsl = cmpPriorityDecrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 33)
        );
        assertThat(rsl, is(0)); //job2.prior - job1.prior = 0 -->> (0)
    }

    //Тесты, проверяющие поведение комбинированых компараторов
    //3. Сортировка <<по имени>> --->> потом <<по приоритету>>
    //3.1 Сортировка по возрастанию
    @Test
    public void whenCompatorByNameAndProrityIncrease() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("CCCP", 20),
                new Job("CCCP", 40)
        );
        assertThat(rsl, lessThan(0)); //job1.prior - job2.prior = - 20 < 0  --> (-1)
    }

    //3.2 Сортировка по убыванию
    @Test
    public void whenCompatorByNameAndProrityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("EUROPE", 20),
                new Job("EUROPE", 40)
        );
        assertThat(rsl, greaterThan(0)); //job2.prior - job1.prior = 20 > 0 --> (+1)
    }

    //3.3 Сортировка по возрастанию -  1-ый объект = 2-му объекту
    @Test
    public void whenCompatorByNameAndProrityIncreaseAndObject1Equals2() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("KAZACHSTAN", 55),
                new Job("KAZACHSTAN", 55)
        );
        assertThat(rsl, is(0)); //job1.prior - job2.prior = 0 --> (0)
    }

    //4. Сортировка <<по приоритету>> --->> потом <<по имени>>
    //4.1 Сортировка по возрастанию
    @Test
    public void whenCompatorByProrityAndNameIncrease() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("bbbbbbbb", 100)
        );
        assertThat(rsl, lessThan(0)); //job1.name - job2.name < 0 --> (-1)
    }

    //4.2 Сортировка по убыванию
    @Test
    public void whenCompatorByProrityAndNameDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("bbbbbbbb", 100)
        );
        assertThat(rsl, greaterThan(0)); //job2.name - job1.name > 0 --> (+1)
    }

    //4.3 Сортировка по возрастанию
    @Test
    public void whenCompatorByProrityAndNameIncreaseAndObject1Equals2() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("aaaaaaaa", 100)
        );
        assertThat(rsl, is(0)); //job1.name - job2.name = 0 --> (0)
    }
}