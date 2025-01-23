import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        String firstName,midName, lastName;
        int hours, rate, salary;

        // Create a Scanner Object
        Scanner scan = new Scanner(System.in);

        // Start user input
        // NOTE: Design/alignment/words for the screen output may vary depends on your desire. Just make sure that the data needed are properly asked, entered and displayed.
        System.out.print("Enter First Name \n ~> ");
        firstName = scan.nextLine();

        System.out.print("Enter Middle Name \n ~> ");
        midName = scan.nextLine();

        System.out.print("Enter Last Name \n ~> ");
        lastName = scan.nextLine();

        System.out.print("Enter Number of hours worked \n ~> ");
        hours = scan.nextInt();

        System.out.print("Enter the rate per hour \n ~> ");
        rate = scan.nextInt();

        // Caculate the salary
        salary = hours * rate;

        // Output the information
        System.out.printf("My name is %s %s %s \n", firstName, midName, lastName);
        System.out.printf("My salary is %d \n", salary);

        // Close the scanner
        scan.close();
    }
}
