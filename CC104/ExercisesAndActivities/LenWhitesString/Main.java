import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare or Initialize the variables
        String userIn, newString = "";
        int chars, whites = 0;
        int i; // For-Loop int counter
        Scanner sc = new Scanner(System.in);

        // User string input
        System.out.print("Enter your input: ");
        userIn = sc.nextLine();

        // Get the number of characters
        chars = userIn.length();

        // Get the number of whitespaces
        // And create a new string without whitespace
        for (i = 0; i < chars; i++) {
            if (userIn.charAt(i) == ' ') {
                whites++;
            } else {
                newString += userIn.charAt(i);
            }
        }

        // Output the following:
        // Upper Border Block
        System.out.println();
        BorderPrint(newString.length());

        // Number of Characters
        System.out.println("The Total Number of Characters: " + chars);

        // Number of WhiteSpaces
        System.out.println("The Total Number of Whitespaces: " + whites);

        // The updated string without whitespace
        System.out.println("The Updated String Omitting the Whitespaces: " + newString);

        // Bottom Border Block
        BorderPrint(newString.length());

        sc.close();
    }

    private static void BorderPrint(int len) {
        int i;
        System.out.print("=============================================");
        for (i = 0; i < len; i++) {
            System.out.print('=');
        }
        System.out.println();
    }
}
