package com.comprog.library.id;

import java.util.Scanner;

public class showID {
    public static void displayPrice(int id1, int id2, int id3, String title1, String title2, String title3, String author1, String author2, String author3, float price1, float price2, float price3, Scanner scanner) {
        System.out.print("Please enter your book ID: ");
        int inID = scanner.nextInt();
        if (inID == id1) {
            System.out.printf("""
                    Price: $ %.2f
                    """, price1);
        } else if (inID == id2) {

            System.out.printf("""
                    Price: $ %.2f
                    """, price2);
        } else if (inID == id3) {
            System.out.printf("""
                    Price: $ %.2f
                    """, price3);
        } else {
            System.out.println("No such ID!");
        }
//        scanner.close();
    }
}
