import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        String word;
        String wordPlain = "", revWord = "";
        final String vowels = "aeiouAEIOU";
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
            if (vowels.indexOf(word.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        // Remove the Special Characters for Preparing Palindrome Checking
        for (i = 0; i < word.length(); i++) {
            // Compare the ASCII Values
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' || word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                wordPlain += word.charAt(i);
            }
        }

        // Reverse the String
        for (i = wordPlain.length() - 1; i >= 0; i--) {
            revWord += wordPlain.charAt(i);
        }

        // Check if Palindrome
        if (wordPlain.equalsIgnoreCase(revWord)) {
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
