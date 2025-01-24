package com.comprog.library.author;

import java.util.Scanner;

public class ShowAuthor {
    public static void displayAuthor(int id1, int id2, int id3, int id4, String title1, String title2, String title3, String title4, String author1, String author2, String author3, String author4, Scanner scanner) {
        boolean found = false;
        System.out.print("Please enter your book author: ");
        String inAuthor = scanner.nextLine();
        System.out.println("Here are the Book(s) from this Author");
        if (inAuthor.equalsIgnoreCase(author1)) {
            System.out.printf("""
                    [Book 1]
                    ID: %s
                    Title: %s
                    """, id1, title1);
            found = true;
        }
        if (inAuthor.equalsIgnoreCase(author2)) {
            System.out.printf("""
                    [Book 2]
                    ID: %s
                    Title: %s
                    """, id2, title2);
            found = true;
        }
        if (inAuthor.equalsIgnoreCase(author3)) {
            System.out.printf("""
                    [Book 3]
                    ID: %s
                    Title: %s
                    """, id3, title3);
            found = true;
        }
        if (inAuthor.equalsIgnoreCase(author4)) {
            System.out.printf("""
                    [Book 4]
                    ID: %s
                    Title: %s
                    """, id4, title4);
            found = true;
        }
        if (!found) {
            System.out.println("No such author!");
        }
    }
}
