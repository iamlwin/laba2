package ru.mirea.gib04.lab2;
import java.lang.*;
public class Author {
    private String author;
    private String name;
    private int page;
    public Author(String s, int i, String s1) {
        author = "Alexandr Pushkin";
        name = "Dubrovskiy";
        page = 360;
    }
    public Author(int p) {
        author = "Fedor Dostoveskiy";
        name = "Idiot";
        page = p;
    }
    public Author(int p, String n) {
        author = "J.K. Rowling";
        name = n;
        page = p;
    }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public String getName() { return name; }
}