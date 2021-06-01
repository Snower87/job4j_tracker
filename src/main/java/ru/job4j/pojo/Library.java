package ru.job4j.pojo;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 3. Массивы и модели. [174892#271561]
 * @Описание 1. Создайте модель данных "Книга" с полями: имя и количество страниц. ru.job4j.pojo.Book.
 * 2. Создайте класс ru.job4j.pojo.Library и в нем метод main.
 * 3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".
 * 4. Выведите содержимое массива на консоль через цикл for + index.
 * 5. Переставьте местами книги с индексом 0 и 3. Выведите содержимое массива на консоль.
 * 6. Добавьте цикл с выводом книг с именем "Clean code".
 * 7. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class Library {
    public static void showAllBooks(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getNameBook() + " " + books[index].getNumSheets());
        }
        System.out.println();
    }

    public static void showItemBookByIndex(Book[] books, int ind) {
        System.out.println(books[ind].getNameBook() + " " + books[ind].getNumSheets());
    }

    public static void showBookCleanCodeAsString(Book[] books, String cleanCode) {
        for (int index = 0; index < books.length; index++) {
            if (books[index].getNameBook().equals(cleanCode)) {
                showItemBookByIndex(books, index);
                System.out.println("index book = " + index + " at massiv Book[]");
            }
        }
        System.out.println();
    }

    public static void showBookCleanCodeAsLink(Book[] books, Book book) {
        for (int index = 0; index < books.length; index++) {
            //   if (books[index] == (book)) { //вариант №1
            if (books[index].equals(book)) { //вариант №2
                System.out.println("Find at link - Successfully");
                showItemBookByIndex(books, index);
                System.out.println("index book = " + index + " at massiv Book[]");
            }
        }
    }

    public static void main(String[] args) {
        Book hill = new Book("Думай и богатей", 240);
        Book hobbit = new Book("Хоббит: путешествие туда и обратно", 360);
        Book java = new Book("Java 8: Полный справочник", 1400);
        Book clean = new Book("Clean code", 180);

        Book[] books = new Book[4];
        books[0] = hill;
        books[1] = hobbit;
        books[2] = java;
        books[3] = clean;

        showAllBooks(books);

        System.out.println("Replace 0 and 3 index.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        showAllBooks(books);

        System.out.println("Find book: Clean code (as String-data)");
        showBookCleanCodeAsString(books, "Clean code");
        System.out.println("Find book: Clean code (as Link-data)");
        showBookCleanCodeAsLink(books, clean);
    }
}