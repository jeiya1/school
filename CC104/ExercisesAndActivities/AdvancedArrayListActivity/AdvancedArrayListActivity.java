import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class AdvancedArrayListActivity {
    public static void main(String[] args) {
        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Loop counter;
        int i;

        // Initialize 2 Arraylist objects named `listA` and `listB`
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        int numA = 0 ,numB = 0;
        // Third ArrayList for merging the two later
        ArrayList<Integer> listC = new ArrayList<>();

        // Starter message
        System.out.println("""
                                            _         _____\s
                  _____  _____ ___ _ __ ___(_)___  __|___  |
                 / _ \\ \\/ / __/ _ \\ '__/ __| / __|/ _ \\ / /\s
                |  __/>  < (_|  __/ | | (__| \\__ \\  __// / \s
                 \\___/_/\\_\\___\\___|_|  \\___|_|___/\\___/_/  \s
                                                           \s 
                """);

        // Set size of listA
        while (true) {
            try {
                System.out.print("How many elements do you want to add for listA?: ");
                numA = scanner.nextInt();
                if (numA >= 0) {
                    break;
                } else {
                    System.out.println("ERROR: Please enter a value greater than or equal to 0");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Invalid input. Try again.");
                scanner.next();
            }
        }

        // Input values for listA
        for (i = 0; i < numA; i++) {
            System.out.print("element " + (i + 1) + ": ");
            try {
                listA.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("ERROR: Invalid input. Try again.");
                i--;
                scanner.next();
            }
        }

        // Set size of listB
        System.out.println();
        while (true) {
            try {
                System.out.print("How many elements do you want to add for listB?: ");
                numB = scanner.nextInt();
                if (numB >= 0) {
                    break;
                } else {
                    System.out.println("ERROR: Please enter a value greater than or equal to 0");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Invalid input. Try again.");
                scanner.next();
            }
        }

        // Input values for listB
        for (i = 0; i < numB; i++) {
            System.out.print("element " + (i + 1) + ": ");
            try {
                listB.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("ERROR: Invalid input. Try again.");
                i--;
                scanner.next();
            }
        }

        // Merge listA and listB into listC
        listC.addAll(listA);
        listC.addAll(listB);

        // HashSet to remove duplicates
        // Initialize HashSet here to add all elements of listC to it
        HashSet<Integer> setA = new HashSet<>(listC);
        listC.clear();
        listC.addAll(setA);

        // Sort the merged list
        Collections.sort(listC);

        // Print final list without duplicates
        System.out.println("\n===== This is the final list =====");
        System.out.println(listC);

        scanner.close();
    }
}
