import java.util.Scanner;

public class Transposed {
    public static void main(String[] args) {
        int row, col;
        int limit;
        int temp;
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

        System.out.println("Array Content: ");
        for (row = 0; row < limit; row++) {
            for (col = 0; col < limit; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (row = 0; row < limit; row++) {
            for (col = row + 1; col < limit; col++) {
                temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        System.out.println("Transposed Array Content: ");
        for (row = 0; row < limit; row++) {
            for (col = 0; col < limit; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
