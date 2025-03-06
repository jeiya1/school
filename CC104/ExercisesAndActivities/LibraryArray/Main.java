import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare the arrays
        int[] id = new int[10];
        String[] title = new String[10];
        String[] author = new String[10];
        float[] price = new float[10];

        // Declare the user choice
        int choice;

        // Declare the scanner
        Scanner scanner = new Scanner(System.in);

        // Give the Welcome Message
        System.out.println("Welcome to the BSIT");
        System.out.println("Library Management System");
        System.out.println("Please Enter Book Information");

        // Start user input
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n===== | BOOK NO. %d | =====\n", i + 1);
            System.out.print("Enter Book ID: ");
            id[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Book Title: ");
            title[i] = scanner.nextLine();
            System.out.print("Enter Book Author: ");
            author[i] = scanner.nextLine();
            System.out.print("Enter Book Price: ");
            price[i] = scanner.nextFloat();
        }

        // Give menu with options 1 to 4
        // Option 4 should exit the user from the program
        do {
            System.out.println("""

                    Please choose one of the following options:
                    1. View All Books by Author
                    2. View All Books by Title
                    3. View All Books Price by ID
                    4. Exit
            """);
            System.out.print("~> ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    showAuthor(author);
                    break;
                case 2:
                    showTitle(title);
                    break;
                case 3:
                    showID(id, price);
                    break;
                case 4:
                    System.out.println("EXITING...");
                    break;
                default:
                    System.out.println("INVALID INPUT. TRY AGAIN.");
                    break;
            }
        } while (choice != 4);
    }

    // Show the authors
    private static void showAuthor(String[] author) {
        for (int i = 0; i < author.length; i++) {
            System.out.printf("Book %d: %s\n", i, author[i]);
        }
    }

    // Show the titles
    private static void showTitle(String[] title) {
        for (int i = 0; i < title.length; i++) {
            System.out.printf("Book %d: %s\n", i, title[i]);
        }
    }

    // Show the id
    private static void showID(int[] id, float[] price) {
        for (int i = 0; i < id.length; i++) {
            System.out.printf("%d: Php %.2f\n", id[i], price[i]);
        }
    }
}
