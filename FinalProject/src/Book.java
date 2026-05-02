public class Book {
    // Attributes
    private String title; //title
    private String author; //author
    private String ISBN; //ISBN
    private int publicationYear; //publicationYear
    private boolean isAvailable; //status

    // Constructor: Initialize title, author, ISBN, publicationYear, setIsAvailable to true (book is available when added)
    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}