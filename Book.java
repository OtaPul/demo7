package main;

public abstract class Book {
    protected String title;
    protected String author;
    protected int pages;
    protected int copies;

    public Book(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    public void displayInfo() {
        System.out.println("Nimi: " + title + ", Kirjailija: " + author + ", Sivut: " + pages + ", Määrä: " + copies);
    }

    public abstract String categorize();

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
