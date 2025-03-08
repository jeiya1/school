import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int limit;
        int even = 0, odd = 0;
        int[] arr;
        int ctr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        limit = sc.nextInt();
        System.out.println("--------------------------");
        arr = new int[limit];

        for (ctr = 0; ctr < limit; ctr++) {
            System.out.print("Enter a number: ");
            arr[ctr] = sc.nextInt();
        }

        for (ctr = 0; ctr < limit; ctr++) {
            if (arr[ctr] % 2 == 0) {
                even += arr[ctr];
            } else {
                odd += arr[ctr];
            }
        }

        System.out.println("--------------------------");
        System.out.println("Total Sum of Even: " + even);
        System.out.println("Total Sum of Odd: " + odd);

        sc.close();
    }
}
