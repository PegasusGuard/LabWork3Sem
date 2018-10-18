package ru.mirea.kerzhen.lab2;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pagecount;
    private double rating;

    public Book() {
        author = "No author, it's folklore";
        title = "Untitled";
        year = 2018;
        pagecount =0;
        rating = 0;
    }

    public Book(String author, String title, int year, int pagecount, double rating) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pagecount = pagecount;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", pagecount=" + pagecount +
                ", rating=" + rating +
                '}';
    }
}
