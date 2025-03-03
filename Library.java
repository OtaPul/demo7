package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kirja lisätty kirjastoon!");
    }

    public void listBooks() {
        int totalCopies = 0;
        for (Book book : books) {
            book.displayInfo();
            System.out.println("Kirjan kategoria: " + book.categorize());
            totalCopies += book.getCopies();
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + totalCopies);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
