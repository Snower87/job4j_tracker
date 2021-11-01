package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompatorByNameIncrease() {
        Comparator<Job> cmpNameIncrease = new JobAscByName();
        int rsl = cmpNameIncrease.compare(
                new Job("AAAAA", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDecrease() {
        Comparator<Job> cmpNameDecrease = new JobDescByName();
        int rsl = cmpNameDecrease.compare(
                new Job("AAAAA", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameDecreaseAndObject1Equals2() {
        Comparator<Job> cmpNameDecrease = new JobDescByName();
        int rsl = cmpNameDecrease.compare(
                new Job("BBBBB", 55),
                new Job("BBBBB", 55)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByPriorityIncrease() {
        Comparator<Job> cmpPriorityIncrease = new JobAscByPriority();
        int rsl = cmpPriorityIncrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 66)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityDecrease() {
        Comparator<Job> cmpPriorityDecrease = new JobDescByPriority();
        int rsl = cmpPriorityDecrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 66)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriorityDecreaseAndObject1Equals2() {
        Comparator<Job> cmpPriorityDecrease = new JobDescByPriority();
        int rsl = cmpPriorityDecrease.compare(
                new Job("AAAAA", 33),
                new Job("AAAAA", 33)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByNameAndProrityIncrease() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("CCCP", 20),
                new Job("CCCP", 40)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("EUROPE", 20),
                new Job("EUROPE", 40)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityIncreaseAndObject1Equals2() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("KAZACHSTAN", 55),
                new Job("KAZACHSTAN", 55)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByProrityAndNameIncrease() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("bbbbbbbb", 100)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByProrityAndNameDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("bbbbbbbb", 100)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByProrityAndNameIncreaseAndObject1Equals2() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("aaaaaaaa", 100),
                new Job("aaaaaaaa", 100)
        );
        assertThat(rsl, is(0));
    }
}