package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void collect7AddrFromListProfiles() {
        Address addrVasia = new Address("Saint-Peterburg", "Morskaya", 14, 35);
        Address addrSergey = new Address("Omsk", "Lenina", 13, 34);
        Address addrDima = new Address("Petrozavodsk", "Ilicha", 62, 33);
        Address addrMarat = new Address("Vitebsk", "Portnaya", 94, 32);
        Address addrPetya = new Address("Dmitriev", "Gagarina", 15, 31);
        Address addrJenia = new Address("V.Pishma", "Zavodskaya", 45, 30);

        List<Profile> profiles = Arrays.asList(
                new Profile(addrVasia),
                new Profile(addrSergey),
                new Profile(addrDima),
                new Profile(addrMarat),
                new Profile(addrPetya),
                new Profile(addrJenia)
        );

        List<Address> expectedAddress = Arrays.asList(
                addrVasia,
                addrSergey,
                addrDima,
                addrMarat,
                addrPetya,
                addrJenia
        );

        assertEquals(expectedAddress, Profiles.collect(profiles));
    }

    @Test
    public void whenCollect1UniqueAddrFromListWith3Profiles() {
        List<Profile> profileList = new ArrayList<>();
        Address addrVasia = new Address("Saint-Peterburg", "Morskaya", 14, 35);
        Profile vasia = new Profile(addrVasia);
        profileList.add(vasia);
        profileList.add(vasia);
        profileList.add(vasia);

        List<Address> expectedAddress = Arrays.asList(
                addrVasia
        );

        assertEquals(expectedAddress, Profiles.collectUnique(profileList));
    }

    @Test
    public void whenCollect2UniqueAddrAndSortedItFromListWith4Profiles() {
        List<Profile> profileList = new ArrayList<>();
        Address addrVasia = new Address("Saint-Peterburg", "Morskaya", 14, 35);
        Profile vasia = new Profile(addrVasia);
        profileList.add(vasia);
        Address addrPetya = new Address("Dmitriev", "Gagarina", 15, 31);
        Profile petya = new Profile(addrPetya);
        profileList.add(petya);
        profileList.add(vasia);
        profileList.add(petya);

        List<Address> expectedAddress = Arrays.asList(
                addrPetya,
                addrVasia
        );

        assertEquals(expectedAddress, Profiles.collectUnique(profileList));
    }

    @Test
    public void whenCollect5UniqueAddrFromListWith5Profiles() {
        List<Profile> profileList2 = new ArrayList<>();
        Address addrVasia = new Address("Saint-Peterburg", "Morskaya", 14, 35);
        Profile vasia = new Profile(addrVasia);
        profileList2.add(vasia);
        Address addrSergey = new Address("Omsk", "Lenina", 13, 34);
        Profile sergey = new Profile(addrSergey);
        profileList2.add(sergey);
        Address addrDima = new Address("Petrozavodsk", "Ilicha", 62, 33);
        Profile dima = new Profile(addrDima);
        profileList2.add(dima);
        Address addrMarat = new Address("Vitebsk", "Portnaya", 94, 32);
        Profile marat = new Profile(addrMarat);
        profileList2.add(marat);
        Address addrPetya = new Address("Dmitriev", "Gagarina", 15, 31);
        Profile petya = new Profile(addrPetya);
        profileList2.add(petya);

        List<Address> expectedAddress = Arrays.asList(
                addrPetya,
                addrSergey,
                addrDima,
                addrVasia,
                addrMarat
        );

        assertEquals(expectedAddress, Profiles.collectUnique(profileList2));
    }

    @Test
    public void whenCollect3UniqueAddrFromListWith7Profiles() {
        List<Profile> profileList2 = new ArrayList<>();
        Address addrVasia = new Address("Saint-Peterburg", "Morskaya", 14, 35);
        Profile vasia = new Profile(addrVasia);
        profileList2.add(vasia);
        Address addrSergey = new Address("Omsk", "Lenina", 13, 34);
        Profile sergey = new Profile(addrSergey);
        profileList2.add(sergey);
        Address addrDima = new Address("Petrozavodsk", "Ilicha", 62, 33);
        Profile dima = new Profile(addrDima);
        profileList2.add(dima);
        profileList2.add(vasia);
        profileList2.add(vasia);
        profileList2.add(sergey);
        profileList2.add(dima);

        List<Address> expectedAddress = Arrays.asList(
                addrSergey,
                addrDima,
                addrVasia
        );

        assertEquals(expectedAddress, Profiles.collectUnique(profileList2));
    }
}