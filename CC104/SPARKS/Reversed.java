import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        int ctr;

        System.out.print("Enter a word/sentence: ");
        sentence = sc.nextLine();

        System.out.print("Reversed a word/sentence: ");
        for (ctr = sentence.length() - 1; ctr >= 0; ctr--){
            System.out.print(sentence.charAt(ctr));
        }

        sc.close();
    }
}
