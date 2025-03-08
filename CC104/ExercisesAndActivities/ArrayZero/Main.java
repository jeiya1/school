import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the Array for User Input
        int[] nums = new int[10];
        // Create a new array where all 0's are pushed
        // WHY: we cannot mutate arrays
        int[] newNums = new int[nums.length];
        // For reasons specified above, create an independent counter
        int numsCounter = 0;
        // For-Loop Int Counter
        int i;

        // Initialize a New Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Input your 10 numbers =====");

        // Scan the 10 Inputs
        for (i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
            sc.nextLine();
        }

        // Move the first array to the second array but only if they are equal to 0
        // The reason to use an independent counter is for allowing the first array to
        // properly be assigned the right index value to the new array
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newNums[numsCounter] = nums[i];
                numsCounter++;
            }
        }

        System.out.println("\n+++++ Pushing all 0's to the end ++++++");

        System.out.println("\n===== Your new array =====");

        // Print the New Array
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                System.out.print("~> {");
            }

            System.out.print(newNums[i]);

            if (i == nums.length - 1) {
                System.out.print("}\n");
            } else {
                System.out.print(",");
            }
        }

        sc.close();
    }
}
