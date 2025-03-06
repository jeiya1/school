import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        int[] numbers = new int[10];
        int i; // For-Loop Int Counter

        // Initialize a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // User-Input
        System.out.println("+++++ Starting Array Input +++++");
        for (i = 0; i < numbers.length; i++) {
            System.out.print("Please enter #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("+++++ Ending Array Input +++++\n");

        // Print the Reversed Array
        System.out.println("+++++ Reversed Array +++++");
        for (i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Print the Alternated Array
        System.out.println("\n+++++ Alternating Array +++++");
        for (i = 0; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }
        for (i = 1; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }

        // Print the Array with +5 per Element
        System.out.println("\n+++++ Added +5 per Element in Array +++++");
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
