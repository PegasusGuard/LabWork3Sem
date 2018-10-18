package ru.mirea.kerzhen.lab2;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Grzegorz Brzeczyszczykewicz", "Chrzaszczyrzewoszyce", 1957, 356, 7.89);
        System.out.println(book1);
        book1.setAuthor("Folk");
        book1.setPagecount(456);
        System.out.println(book1);
    }
}
