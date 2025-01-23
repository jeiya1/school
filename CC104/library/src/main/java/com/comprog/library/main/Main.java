package com.comprog.library.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.comprog.library.author.showAuthor;
import com.comprog.library.id.showID;
import com.comprog.library.title.showTitle;

public class Main {

    public static void main(String[] args) {
        Scanner lib = new Scanner(System.in);
        int bookId1, bookId2, bookId3;
        String title1, title2, title3;
        String author1, author2, author3;
        float price1, price2, price3;

        System.out.println("Library Management System");
        System.out.println("Please enter Book Information");

        // 1
        System.out.println("Enter Book No. 1");
        System.out.print("Enter Book ID: ");
        bookId1 = lib.nextInt();
        lib.nextLine();
        System.out.print("Enter Book Title: ");
        title1 = lib.nextLine();
        System.out.print("Enter Book Author: ");
        author1 = lib.nextLine();
        System.out.print("Enter Book Price: ");
        price1 = lib.nextFloat();
        lib.nextLine();

        // 2
        System.out.println("Enter Book No. 2");
        System.out.print("Enter Book ID: ");
        bookId2 = lib.nextInt();
        lib.nextLine();
        System.out.print("Enter Book Title: ");
        title2 = lib.nextLine();
        System.out.print("Enter Book Author: ");
        author2 = lib.nextLine();
        System.out.print("Enter Book Price: ");
        price2 = lib.nextFloat();
        lib.nextLine();

        // 3
        System.out.println("Enter Book No. 3");
        System.out.print("Enter Book ID: ");
        bookId3 = lib.nextInt();
        lib.nextLine();
        System.out.print("Enter Book Title: ");
        title3 = lib.nextLine();
        System.out.print("Enter Book Author: ");
        author3 = lib.nextLine();
        System.out.print("Enter Book Price: ");
        price3 = lib.nextFloat();
        lib.nextLine();

        System.out.println("Unfortunately, 3 books is the most we can store.");

        int option = 0;

        do {
            System.out.println("""
                
                Please choose one of the following options:
                1. View All Books by Author
                2. View All Books by Title
                3. View All Books Price by ID
                4. Exit
                """);
            System.out.print("~> ");
            option = lib.nextInt();
            lib.nextLine();

            switch (option) {
                case 1:
                    showAuthor.displayAuthor(bookId1, bookId2, bookId3, title1, title2, title3, author1, author2, author3, price1, price2, price3, lib);
                    break;

                case 2:
                    showTitle.displayTitle(bookId1, bookId2, bookId3, title1, title2, title3, author1, author2, author3, price1, price2, price3, lib);
                    break;

                case 3:
                    showID.displayPrice(bookId1, bookId2, bookId3, title1, title2, title3, author1, author2, author3, price1, price2, price3, lib);
                    break;

                case 4:
                    System.out.println("EXITING...");
                    break;

                default:
                    System.out.println("Input out of range! Try again...");
                    break;
            }

        } while (option != 4);

    }
}