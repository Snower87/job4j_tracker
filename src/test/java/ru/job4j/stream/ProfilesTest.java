package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void collect7AddrFromListProfiles() {
        //1. Формирование входных значений
        Address addrVasia = new Address("Saint-Peterburg","Morskaya",14, 35);
        Address addrSergey = new Address("Omsk","Lenina",13, 34);
        Address addrDima = new Address("Petrozavodsk","Ilicha",62, 33);
        Address addrMarat = new Address("Vitebsk","Portnaya",94, 32);
        Address addrPetya = new Address("Dmitriev","Gagarina",15, 31);
        Address addrJenia = new Address("V.Pishma","Zavodskaya",45, 30);

        List<Profile> profiles = Arrays.asList(
                new Profile(addrVasia),
                new Profile(addrSergey),
                new Profile(addrDima),
                new Profile(addrMarat),
                new Profile(addrPetya),
                new Profile(addrJenia)
        );

        //2. Ожидаемый список адресов на выходе
        List<Address> expectedAddress = Arrays.asList(
                addrVasia,
                addrSergey,
                addrDima,
                addrMarat,
                addrPetya,
                addrJenia
        );

        //3. Выдать ошибку, если не равны
        assertEquals(expectedAddress, Profiles.collect(profiles));
    }
}