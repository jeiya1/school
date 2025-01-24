package com.comprog.library.title;

import java.util.Scanner;

public class ShowTitle {
    public static void displayTitle(int id1, int id2, int id3, int id4, String title1, String title2, String title3, String title4, String author1, String author2, String author3, String author4, Scanner scanner) {
        boolean found = false;
        System.out.print("Please enter your Title: ");
        String inTitle = scanner.nextLine();
        System.out.println("Here are the Book(s) from this Title");
        if (inTitle.equalsIgnoreCase(title1)) {
            System.out.printf("""
                    [Book 1]
                    ID: %s
                    Author: %s
                    """, id1, author1);
            found = true;
        }
        if (inTitle.equalsIgnoreCase(title2)) {
            System.out.printf("""
                    [Book 2]
                    ID: %s
                    Author: %s
                    """, id2, author2);
            found = true;
        }
        if (inTitle.equalsIgnoreCase(title3)) {
            System.out.printf("""
                    [Book 3]
                    ID: %s
                    Author: %s
                    """, id3, author3);
            found = true;
        }
        if (inTitle.equalsIgnoreCase(title4)) {
            System.out.printf("""
                    [Book 3]
                    ID: %s
                    Author: %s
                    """, id4, author4);
            found = true;
        }
            if (!found) {
            System.out.println("No such title!");
        }
    }
}
