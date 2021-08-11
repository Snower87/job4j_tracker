package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {
    @Test
    public void whenAdd2AccountsAndItsExpected() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDelete2Accounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("001", "Snab Shtepers", "001456226"),
                new Account("001", "Snab Shtepers", "001456226"),
                new Account("002", "Ivan Permiakov", "001456226"),
                new Account("003", "Igor Opozdalov", "111222345"),
                new Account("003", "Igor Opozdalov", "111222345")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("001", "Snab Shtepers", "001456226"),
                        new Account("002", "Ivan Permiakov", "001456226"),
                        new Account("003", "Igor Opozdalov", "111222345")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}