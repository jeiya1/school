import java.util.Scanner;

public class EvenOddThree {
    public static void main(String[] args) {
        int x,y,z;
        int[][][] matrix;
        int layer1,layer2,layer3;
        int even = 0, odd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.print("Enter z: ");
        z = sc.nextInt();
        System.out.println("--------------------------");

        matrix = new int[x][y][z];

        for (layer1 = 0; layer1 < x; layer1++) {
            for (layer2 = 0; layer2 < y; layer2++) {
                for (layer3 = 0; layer3 < z; layer3++) {
                    System.out.print("Enter a number: ");
                    matrix[layer1][layer2][layer3] = sc.nextInt();
                }
            }
        }
        System.out.println("--------------------------");

        System.out.println("Array Content: ");
        for (layer1 = 0; layer1 < x; layer1++) {
            for (layer2 = 0; layer2 < y; layer2++) {
                for (layer3 = 0; layer3 < z; layer3++) {
                    System.out.print(matrix[layer1][layer2][layer3] + "\t");
                    if (matrix[layer1][layer2][layer3] % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("--------------------------");

        System.out.println("Total Even Numbers: " + even);
        System.out.println("Total Odd Numbers: " + odd);

        sc.close();
    }
}
