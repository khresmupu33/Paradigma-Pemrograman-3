// Khresna Mulia Putra 2572032
package soal2;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books;

    public BookList() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books to show");
        } else {
            int i=1;
            for (Book book : books) {
                System.out.println(i+". ("+ book.getIsbn()+") '"+ book.getTitle()+"' by "+ book.getAuthor());
                i++;
            }
        }
    }
}

