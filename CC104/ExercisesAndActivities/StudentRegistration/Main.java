import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objects
        Scanner sc = new Scanner(System.in);
        RegistrationSystem system = new RegistrationSystem();

        // Variables for the Main menu
        boolean running = true;
        int menuChoice;

        // Student variables
        String name;
        int studentId;
        double gpa;

        while (running) {
            System.out.println("""
                
                --- Student Registration System ---
                [1] Add a new student
                [2] Remove a student by ID
                [3] Display all registered students
                [4] Find student by ID
                [0] Exit program
                """);
            try {
                System.out.print("~> ");
                menuChoice = sc.nextInt();
                switch (menuChoice) {
                    case 1:
                        // Enter name, ID, and GPA and then turn it into an Object to bundle the data together
                        System.out.println();
                        System.out.print("Enter student name: ");
                        sc.nextLine();
                        name = sc.nextLine();
                        System.out.print("Enter student ID: ");
                        studentId = sc.nextInt();

                        if (studentId <= -1) {
                            System.out.println("ERROR: Invalid Student ID");
                            break;
                        }

                        System.out.print("Enter GPA: ");
                        gpa = sc.nextDouble();

                        if (gpa < 0.0 || gpa > 4.0) {
                            System.out.println("ERROR: Invalid GPA");
                            break;
                        }

                        Student newStudent = new Student(name, studentId, gpa);

                        if (system.addStudent(newStudent)) {
                            System.out.println("--- Student added successfully");
                        } else {
                            System.out.println("ERROR: Student ID already exists");
                        }

                        break;
                    case 2:
                        System.out.print("Enter student ID to remove: ");
                        studentId = sc.nextInt();

                        if (system.removeStudent(studentId)) {
                            System.out.println("--- Student removed successfully");
                        } else {
                            System.out.println("ERROR: Student ID not found");
                        }

                        break;
                    case 3:
                        system.displayStudents();
                        break;
                    case 4:
                        System.out.println();
                        System.out.print("Enter student ID to find: ");
                        studentId = sc.nextInt();
                        Student found = system.findStudent(studentId);

                        if (found != null) {
                            System.out.println();
                            System.out.println("--- Student found: " + found);
                        } else {
                            System.out.println("ERROR: Student not found");
                        }

                        break;
                    case 0:
                        System.out.println();
                        System.out.println("--- Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("ERROR: Invalid input. Try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Invalid input. Try again.");
                sc.nextLine();
            }
        }
    }
}