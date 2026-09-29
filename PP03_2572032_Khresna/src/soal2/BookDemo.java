// Khresna Mulia Putra 2572032
package soal2;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Library Application");
            System.out.println("1. show all books");
            System.out.println("2. Add new book");
            System.out.println("3. search book");
            System.out.println("4. Exit");
            System.out.print("choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Wrong choice");
                System.out.println();
                continue;
            }

            switch (choice) {
                case 1:
                    bookList.showAllBooks();
                    break;
                case 2:
                    System.out.print("New ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("New Title: ");
                    String title = scanner.nextLine();
                    System.out.print("New Author: ");
                    String author = scanner.nextLine();
                    bookList.addBook(new Book(isbn, title, author));
                    break;
                case 3:
                    System.out.print("search (isbn): ");
                    String searchIsbn = scanner.nextLine();
                    Book foundBook = bookList.searchBook(searchIsbn);
                    if (foundBook != null) {
                        System.out.println("Book found");
                        System.out.println("ISBN: " + foundBook.getIsbn());
                        System.out.println("Title: " + foundBook.getTitle());
                        System.out.println("Author: " + foundBook.getAuthor());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}

