package bg.tu_varna.sit.task05;

public class Book {

    private String title;
    private Author author;
    private int availableQuantity;

    public Book(String title, Author author, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.availableQuantity = availableQuantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public boolean equals(Object o) {
        Book book = (Book) o;
        return this.title.equals(book.title) && this.author.equals(book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = " + title +
                ", author = " + author +
                ", availableQuantity = " + availableQuantity +
                '}';
    }
}
