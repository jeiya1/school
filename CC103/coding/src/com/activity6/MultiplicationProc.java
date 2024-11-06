import java.util.Scanner;
public class MultiplicationProc {
    public static void main(String[] args) {
        // Initialization
        boolean programStop = false;
        byte programBehaviour;
        int x,multiplicand,multiplier;
        long product;

        Scanner input = new Scanner(System.in);
        // Prints a window that shows choices for actions to be perform.
        while (!programStop) {
            System.out.println("___________________________________________________________________");
            System.out.println("OO______________JEDCA-ARDRJR-RABV MultiplicationProc_____________OO");
            System.out.println("||                                                               ||");
            System.out.println("||                      1 - Multiplication                       ||");
            System.out.println("||                      0 - Exit                                 ||");
            System.out.println("||_______________________________________________________________||");
            System.out.println("");
            System.out.println("   Enter '1' to perform Multiplication or 0 to Exit the program");
            System.out.print("\t\t   Enter your input here >> ");
            programBehaviour = input.nextByte();
            System.out.println("");
            // Using the Switch case statement, this will be the one responsible on what action to perform 
            // depending on the user input in the object program.
            switch (programBehaviour) {
            // Takes user input for multiplicand and multiplier.
                case 1:
                    System.out.println("===================================================================\n");
                    System.out.println("__________________________________________________________________");
                    System.out.println("|             JEDCA-ARDRJR-RABV MultiplicationProc               |");
                    System.out.println("__________________________________________________________________");
                    System.out.println("__________________________________________________________________");
                    System.out.print("      Enter a number for your multiplicand\t>\t");
                    multiplicand = input.nextInt();
                    System.out.print("      Enter a number for your multiplier\t>>\t");
                    multiplier = input.nextInt();
                    System.out.println("__________________________________________________________________");
                    System.out.println("");
                    // Checks if both inputs are not negative
                    if (multiplicand >= 0 && multiplier >= 0) {
                        // The Main Process kung saan nagbabago ang value ng product based on the operation per loop.
                        product = 0; // This is where all the values will accumulate inside the forLoop statement.
                        for (x = 0; x < multiplier; x+=1 ){
                            // The body of the loop, where the product increases by what the user had inputted for multiplicand.
                            product = product + multiplicand; 
                        }
                        // Prints the Result showing the multiplicand,multiplier, and product.
                        System.out.println("__________________________________________________________________");
                        System.out.println("|                   R   E   S   U   L   T   S                    |");
                        System.out.println("__________________________________________________________________");
                        System.out.println("\t    _________________________________________");
                        System.out.println("\t    |\tMultiplicand\t:\t" + multiplicand + "\t    |");
                        System.out.println("\t    |\tMultiplier\t:\t" + multiplier + "\t    |");
                        System.out.println("\t    | ===================================== |");
                        System.out.println("\t    |\tProduct   \t:\t" + product + "\t    |");
                        System.out.println("\t    _________________________________________");
                        System.out.println("\n================||- -(Going back to Main Menu)- -||================\n");
                    }
                    // Prints when one of the inputs for multiplicand and multiplier is negative.
                    else {
                        System.out.println("__________________________________________________________________");
                        System.out.println("|                   R   E   S   U   L   T   S                    |");
                        System.out.println("__________________________________________________________________");
                        System.out.println("\t    _________________________________________");
                        System.out.println("\t    |\tMultiplicand\t:\t" + multiplicand + "\t    |");
                        System.out.println("\t    |\tMultiplier\t:\t" + multiplier + "\t    |");
                        System.out.println("\t    | ===================================== |");
                        System.out.println("\t    |    Negative number/s not accepted     |");
                        System.out.println("\t    _________________________________________");
                    }
                    break;
                // Prints when the user enters the number "0".
                case 0:
                    System.out.println("====================||- -(Closing Program)- -||====================\n");
                    programStop = true;
                    break;
                // Prints when the user enters a number that is not "0" or "1" {0,1}.
                default:
                    System.out.println("---------------- !!(Please Input a Valid Number)!! ----------------\n");
                    break;
            }
        }
        // Closes the Scanner
        input.close();
    }
}
