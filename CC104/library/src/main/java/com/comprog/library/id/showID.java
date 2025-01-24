package com.comprog.library.id;

import java.util.Scanner;

public class showID {
    public static void displayPrice(int id1, int id2, int id3, int id4, float price1, float price2, float price3, float price4, Scanner scanner) {
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
        } else if (inID == id4) {
            System.out.printf("""
                    Price: $ %.2f
                    """, price4);
        } else {
            System.out.println("No such ID!");
        }
    }
}
