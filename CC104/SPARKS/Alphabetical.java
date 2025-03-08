import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        // For this, look up "bubble sort" on the internet
        int limit;
        String temp;
        String[] words;
        int ctr, sort1, sort2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        limit = sc.nextInt();
        sc.nextLine();
        System.out.println();

        words = new String[limit];

        for (ctr = 0; ctr < limit; ctr++) {
            System.out.print("Enter a word: ");
            words[ctr] = sc.nextLine();
        }

        for (sort1 = 0; sort1 < words.length - 1; sort1++) {
            for (sort2 = 0; sort2 < words.length - sort1 - 1; sort2++) {
                if (words[sort2].compareTo(words[sort2 + 1]) > 0) {
                    temp = words[sort2];
                    words[sort2] = words[sort2 + 1];
                    words[sort2 + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.print("Alphabetically Order: ");
        for (ctr = 0; ctr < words.length; ctr++) {
            System.out.print(words[ctr]);
            if (ctr < words.length - 1) {
                System.out.print(", ");

            }
        }

        sc.close();
    }
}