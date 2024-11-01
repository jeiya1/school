/* Full Name (Members) : Aniag, Joseph D.C.
 *                     : Delos Reyes, Albert R., Jr.
 *                     : Victoria, Rendelle Aezakimak
 *       Group #       : Group 3
 *       Section       : BSIT 1F - G2
 */

import java.util.Scanner;
public class DayOfWeekSelector {
    public static void main(String[] args) {
        // Initialization    
        int input;
        // Scans User Input
        Scanner forDay = new Scanner(System.in);
        // Prints a window that shows "Day of Week Selector" with a number for selection
        // for a specific day and for exiting the program.
        System.out.println(" ________________________________________________________");
        System.out.println("||________________Day of Week Selector__________________||");
        System.out.println("||________________Schedule/Activities___________________||");
        System.out.println("||                                                      ||");
        System.out.println("||                  1 - Monday                          ||");
        System.out.println("||                  2 - Tuesday                         ||");
        System.out.println("||                  3 - Wednesday                       ||");
        System.out.println("||                  4 - Thursday                        ||");
        System.out.println("||                  5 - Friday                          ||");
        System.out.println("||                  6 - Saturday                        ||");
        System.out.println("||                  7 - Sunday                          ||");
        System.out.println("||                                                      ||");
        System.out.println("||                  0 - Exit Program                    ||");
        System.out.println("||______________________________________________________||\n");
        // Makes the user, input a number from the window of selection.
        System.out.print("Enter a number from 0 - 7 to choose a day >>      ");
        input = forDay.nextInt();
        // Actions that will be performed when the user enters a valid input corresponding to a specific day.
        switch (input) {
            case 0:
                System.out.println("____________________________________________");
                System.out.println("||============ Program Closing ===========||");
                System.out.println("||________________________________________||");
                System.out.println("");
                break;
            case 1:
                System.out.println("________________________________________________");
                System.out.println("||             Monday - Activities            ||");
                System.out.println("||____________________________________________||");
                System.out.println("||     4:00 AM - 6:00 AM : Preparation        ||");
                System.out.println("||     6:00 AM - 6:40 AM : Going to School    ||");
                System.out.println("||     6:40 AM - 7:00 PM : Learning at School ||");
                System.out.println("||     7:00 PM - 7:40 PM : Going Home         ||");
                System.out.println("||     7:40 PM - 9:00 PM : Resting            ||");
                System.out.println("||          9:00 PM      : Sleeping           ||");
                System.out.println("||____________________________________________||");
                System.out.println("");
                break;
            case 2:
                System.out.println("________________________________________________");
                System.out.println("||             Tuesday - Activities           ||");
                System.out.println("||____________________________________________||");
                System.out.println("||     6:00 AM - 8:00 AM : Preparation        ||");
                System.out.println("||     8:00 AM - 8:40 AM : Going to School    ||");
                System.out.println("||     9:00 AM - 5:00 PM : Learning at School ||");
                System.out.println("||     5:00 PM - 5:40 PM : Going Home         ||");
                System.out.println("||     5:40 PM - 7:00 PM : Resting            ||");
                System.out.println("||     7:00 PM - 8:00 PM : Free time          ||");
                System.out.println("||          9:00 PM      : Sleeping           ||");
                System.out.println("||____________________________________________||");
                System.out.println("");
                break;
            case 3:
                System.out.println("________________________________________________");
                System.out.println("||            Wednesday - Activities          ||");
                System.out.println("||____________________________________________||");
                System.out.println("||     4:00 AM - 6:00 AM : Preparation        ||");
                System.out.println("||     6:00 AM - 6:40 AM : Going to School    ||");
                System.out.println("||     6:40 AM - 2:30 PM : Learning at School ||");
                System.out.println("||     2:30 PM - 3:10 PM : Going Home         ||");
                System.out.println("||     3:10 PM - 4:00 PM : Resting            ||");
                System.out.println("||     4:00 PM - 9:00 PM : Free time          ||");
                System.out.println("||          9:00 PM      : Sleeping           ||");
                System.out.println("||____________________________________________||");
                System.out.println("");
                break;
            case 4:
                System.out.println("________________________________________________");
                System.out.println("||           Thursday - Activities            ||");
                System.out.println("||____________________________________________||");
                System.out.println("||     4:00 AM - 6:00 AM : Preparation        ||");
                System.out.println("||     6:00 AM - 6:40 AM : Going to School    ||");
                System.out.println("||     6:40 AM - 1:00 PM : Learning at School ||");
                System.out.println("||     1:00 PM - 1:40 PM : Going Home         ||");
                System.out.println("||     1:40 PM - 2:40 PM : Resting            ||");
                System.out.println("||     2:40 PM - 9:00 PM : Free time          ||");
                System.out.println("||          9:00 PM      : Sleeping           ||");
                System.out.println("||____________________________________________||");
                System.out.println("");
                break;
            case 5:
                System.out.println("________________________________________________");
                System.out.println("||            Friday  - Activities            ||");
                System.out.println("||____________________________________________||");
                System.out.println("||     7:00 AM - 7:30 AM : Preparation(Wakeup)||");
                System.out.println("||     7:30 AM - 8:30 AM : Chores and Others  ||");
                System.out.println("||     8:30 AM - 11:30AM : Free time          ||");
                System.out.println("||     11:30 AM- 12:20PM : Preparation(School)||");
                System.out.println("||     12:20 PM- 1:00 PM : Going to School    ||");
                System.out.println("||     1:00 PM - 2:30 PM : Learning at School ||");
                System.out.println("||     2:30 PM - 3:10 PM : Going Home         ||");
                System.out.println("||     3:10 PM - 4:00 PM : Resting            ||");
                System.out.println("||     4:00 PM - 9:00 PM : Free time          ||");
                System.out.println("||          9:00 PM      : Sleeping           ||");
                System.out.println("||____________________________________________||");
                System.out.println("");
                break; 
            case 6:
                System.out.println("____________________________________________");
                System.out.println("||          Saturday - Activities         ||");
                System.out.println("||________________________________________||");
                System.out.println("|| 6:00 AM - 6:30 AM : Preparation(Wakeup)||");
                System.out.println("|| 6:30 AM - 7:00 PM : Free time          ||");
                System.out.println("||                   : Chores and Others  ||");
                System.out.println("|| 7:00 PM - 9:00 PM : Study              ||");
                System.out.println("||      9:00 PM      : Sleep              ||");
                System.out.println("||________________________________________||");
                System.out.println("");
                break;
            case 7:
                System.out.println("____________________________________________");
                System.out.println("||           Sunday - Activities          ||");
                System.out.println("||________________________________________||");
                System.out.println("|| 6:00 AM - 6:30 AM : Preparation(Wakeup)||");
                System.out.println("|| 6:30 AM - 7:00 PM : Free time          ||");
                System.out.println("||                   : Chores and Others  ||");
                System.out.println("|| 7:00 PM - 9:00 PM : Study              ||");
                System.out.println("||      9:00 PM      : Sleep              ||");
                System.out.println("||________________________________________||");
                System.out.println("");
                break;
            // Prints an "Invalid Input", when the user enters a number that is not on the choices.
            default: 
                System.out.println("____________________________________________");
                System.out.println("||               Invalid Input.           ||");
                System.out.println("||Please enter a number from the selection||");
                System.out.println("||________________________________________||");
                System.out.println("");
                break;
        }

        // Closes the Scanner.
        forDay.close();
    }
}
