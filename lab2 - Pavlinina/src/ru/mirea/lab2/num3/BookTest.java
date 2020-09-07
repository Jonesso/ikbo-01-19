package ru.mirea.lab2.num3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Crime and Punishment", "Dostyevsky", 1932, 413);
        System.out.println(book);
        System.out.println();
        book.setPages(454);
        book.setYear(1927);
        System.out.println(book);
    }
}
