package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int numSheets;

    public Book(String nameBook, int numSheets) {
        this.nameBook = nameBook;
        this.numSheets = numSheets;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumSheets() {
        return numSheets;
    }

    public void setNumSheets(int numSheets) {
        this.numSheets = numSheets;
    }
}