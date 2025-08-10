package com.lib;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book : " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void borrowBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (b.isAvailable()) {
                    b.borrow();
                    System.out.println("You borrowed: " + b.getTitle());
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                if (!b.isAvailable()) {
                    b.returnBook();
                    System.out.println("Book returned: " + b.getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
