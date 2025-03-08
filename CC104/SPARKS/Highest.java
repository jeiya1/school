import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        int limit, highest = 0;
        int[] arr;
        int ctr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        limit = sc.nextInt();
        System.out.println("--------------------------");

        arr = new int[limit];

        // This approach could also work for EvenOdd and EvenOddThree
        // But we will use the simpler approach moving forward
        for (ctr = 0; ctr < limit; ctr++) {
            System.out.print("Enter a number: ");
            arr[ctr] = sc.nextInt();
            if (ctr == 0 || arr[ctr] > highest) {
                highest = arr[ctr];
            }
        }

        // Simpler approach
        // for (ctr = 0; ctr < limit; ctr++){
        //     System.out.print("Enter a number: ");
        //     arr[ctr] = sc.nextInt();
        // }
        // highest = arr[0];
        // for (ctr = 0; ctr < limit; ctr++){
        //     if (arr[ctr] > highest){
        //         highest = arr[ctr];
        //     }
        // }

        System.out.println("--------------------------");
        System.out.println("Highest Number: " + highest);

        sc.close();
    }
}
