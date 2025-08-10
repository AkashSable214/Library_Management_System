package com.lib;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("********* List Of All Book *********");
        library.addBook(new Book(1, "The White Tiger", "Aravind Adiga"));
        library.addBook(new Book(2, "Train to Pakistan", "Khushwant Singh"));
        library.addBook(new Book(3, "The God of Small Things", "Arundhati Roy"));
        library.addBook(new Book(4, "Malgudi Days", "R.K. Narayan"));
        library.addBook(new Book(5, "The Inheritance of Loss", "Kiran Desai"));

        library.addUser(new User(101, "Amit Sharma", "amit.sharma@example.com"));
        library.addUser(new User(102, "Priya Verma", "priya.verma@example.com"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> {
                    System.out.print("Enter Book ID to borrow: ");
                    int id = sc.nextInt();
                    library.borrowBook(id);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    library.returnBook(id);
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
