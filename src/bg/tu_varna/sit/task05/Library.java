package bg.tu_varna.sit.task05;

public class Library {

    private Book[] books;

    public Library() {
        this.books = new Book[10000];
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public int countBooksByAuthor(Author author) {
        int count = 0;
        for (int i = 0; books[i] != null; i++) {
            if (books[i].getAuthor().equals(author))
                count++;
        }
        return count;
    }

}
