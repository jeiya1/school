import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        String word, revWord = "";
        int vowelCount = 0;
        int i; // For-Loop Int Counter
        boolean isPalindrome = false;

        // Initialize a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // User-Input
        System.out.print("Please enter a word: ");
        word = scanner.nextLine();

        // Get the Vowel Counts
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u' ||
                    word.charAt(i) == 'A' ||
                    word.charAt(i) == 'E' ||
                    word.charAt(i) == 'I' ||
                    word.charAt(i) == 'O' ||
                    word.charAt(i) == 'U'
            ) {
                vowelCount++;
            }
        }

        // Reverse the String
        for (i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }

        // Check if Palindrome
        if (word.equalsIgnoreCase(revWord)) {
            isPalindrome = true;
        }

        // Print the Following:
        System.out.println("\n======================");
        System.out.println("Reversed Word: " + revWord);
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Is a Palindrome: " + isPalindrome);
        System.out.println("======================");
    }
}
