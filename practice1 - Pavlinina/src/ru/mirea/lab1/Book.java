package ru.mirea.lab1;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int year;

    public Book() {
    }

    public Book(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    ;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book \"" + name + "\":\nAuthor: " + author + "\nGenre: " + genre + "\nYear of publication: " + year;
    }
}
