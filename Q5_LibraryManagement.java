// library/books/Book.java
package library.books;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public void displayDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }
}


// library/members/Member.java
package library.members;

public class Member {
    private int memberId;
    private String name;
    private String email;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }

    public void displayDetails() {
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
        System.out.println("Email     : " + email);
    }
}


// library/transactions/Transaction.java
package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private int transactionId;
    private Book book;
    private Member member;

    public Transaction(int transactionId, Book book, Member member) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
    }

    public void issueBook() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Transaction ID : " + transactionId);
            System.out.println("Book issued    : " + book.getTitle());
            System.out.println("Issued to      : " + member.getName());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook() {
        book.setAvailable(true);
        System.out.println(book.getTitle() + " returned by " + member.getName());
    }
}


// LibraryMain.java
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        System.out.println("--- Adding New Book ---");
        Book book = new Book(1001, "Clean Code", "Robert C. Martin");
        book.displayDetails();

        System.out.println("\n--- Registering Member ---");
        Member member = new Member(501, "Carol White", "carol@mail.com");
        member.displayDetails();

        System.out.println("\n--- Issuing Book ---");
        Transaction t = new Transaction(3001, book, member);
        t.issueBook();

        System.out.println("\n--- Returning Book ---");
        t.returnBook();
    }
}
