package ru.mirea.practice2.num1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("J.K.Rowling", "jk_rowling@outlook.com", 'F');
        System.out.println(author);
        author.setEmail("jkr1977@gmail.com");
        System.out.println();
        System.out.println(author);
    }
}
