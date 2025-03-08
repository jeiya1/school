import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int row, col;
        int sum = 0;
        int limit;
        int[][] matrix;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        limit = sc.nextInt();
        System.out.println("--------------------------");

        matrix = new int[limit][limit];

        for (row = 0; row < limit; row++) {
            for (col = 0; col < limit; col++) {
                System.out.print("Enter a number: ");
                matrix[row][col] = sc.nextInt();
            }
        }
        System.out.println("--------------------------");

        System.out.println("Array Content:");
        for (row = 0; row < limit; row++) {
            for (col = 0; col < limit; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        for (row = 0; row < limit; row++) {
            for (col = row; col < limit; col++) {
                sum += matrix[row][col];
            }
        }

        System.out.println("--------------------------");
        System.out.println("Sum of Upper Triangle: " + sum);

        sc.close();
    }
}
