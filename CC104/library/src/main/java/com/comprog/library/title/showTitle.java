package com.comprog.library.title;

import java.util.Scanner;

public class showTitle {
    public static void displayTitle(int id1, int id2, int id3, String title1, String title2, String title3, String author1, String author2, String author3, float price1, float price2, float price3, Scanner scanner) {
        boolean found = false;
        System.out.print("Please enter your Title: ");
        String inTitle = scanner.nextLine();
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
        if (!found) {
            System.out.println("No such title!");
        }
    }
}
