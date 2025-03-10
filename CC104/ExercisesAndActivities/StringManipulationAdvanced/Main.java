import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare the necessary variables
        final String GIVENWORD = "Jeiya Net";
        final String VOWELS = "aeiouAEIOU";
        String plainText = "", plainSentence = "";
        int loopCtr;
        String userin;
        int vowels = 0, consonants = 0;
        String longest, revwordFull = "", revword = "", upperin, lowerin, undersc, concatWord;
        boolean isPal, equal, equalIn;

        // Initialize a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the User Input
        System.out.print("Enter a string: ");
        userin = scanner.nextLine();

        // Remove the special characters such as !#@#$
        for (loopCtr = 0; loopCtr < userin.length(); loopCtr++) {
            if (userin.charAt(loopCtr) >= 'a' && userin.charAt(loopCtr) <= 'z' ||
                userin.charAt(loopCtr) >= 'A' && userin.charAt(loopCtr) <= 'Z' ||
                userin.charAt(loopCtr) == ' ') {
                plainSentence += userin.charAt(loopCtr);
            }
        }

        // Remove the spaces from the plainSentence
        plainText = plainSentence.replace(" ", "");

        // Get the number of Vowels and Consonants
        for (loopCtr = 0; loopCtr < plainText.length(); loopCtr++) {
            if (VOWELS.indexOf(plainText.charAt(loopCtr)) == -1) {
                consonants++;
            } else {
                vowels++;
            }
        }

        // Get the longest word
        longest = longestWord(plainSentence);

        // As a pre-requisite to the next variables, we need to reverse the sentence
        // Reversed word without special characters
        for (loopCtr = plainSentence.length() - 1; loopCtr >= 0; loopCtr--) {
            if (plainSentence.charAt(loopCtr) != ' ') {
                revword += plainSentence.charAt(loopCtr);
            }
        }

        // Reversed word with special characters
        for (loopCtr = userin.length() - 1; loopCtr >= 0; loopCtr--) {
            revwordFull += userin.charAt(loopCtr);
        }

        // Check if it is a palindrome
        isPal = plainText.equalsIgnoreCase(revword);

        // Get the Uppercase of the string
        upperin = userin.toUpperCase();

        // Get the Lowercase of the string
        lowerin = userin.toLowerCase();

        // Replace the spaces with underscores
        undersc = userin.replace(' ', '_');

        // Check if the Given String and the User Input String are equal (Case-Sensitive)
        equal = GIVENWORD.equals(userin);

        // Check if the Given String and the User Input String are equal (Case-InSensitive)
        equalIn = GIVENWORD.equalsIgnoreCase(userin);

        // Concatenate the Given String and the User Input String
        concatWord = GIVENWORD + userin;

        // Output the following:
        System.out.println("============================");
        System.out.println("-----> Given Word: " + GIVENWORD);
        System.out.println("============================");
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Longest word: " + longest);
        System.out.println("Is the string a palindrome?: " + isPal);
        System.out.println("Uppercase: " + upperin);
        System.out.println("Lowercase: " + lowerin);
        System.out.println("String with underscores: " + undersc);
        System.out.println("Reversed string: " + revwordFull);
        System.out.println("Are the strings equal (case-sensitive)?: " + equal);
        System.out.println("Are the strings equal (case-insensitive)?: " + equalIn);
        System.out.println("Concatenated Result: " + concatWord);
    }
    private static String longestWord(String sentence) {
        String longest = "", word;
        int start = 0, end = 0;

        while (start < sentence.length()) {
            end = sentence.indexOf(' ', start + 1);
            if (end == -1) {
                end = sentence.length();
            }
            word = sentence.substring(start, end);
            if (word.length() >= longest.length()) {
                longest = word;
            }
            start = end + 1;
        }

        return longest;
    }
}
