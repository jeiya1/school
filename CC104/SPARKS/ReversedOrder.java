import java.util.Scanner;

public class ReversedOrder {
    public static void main(String[] args) {
        String sentence;
        String[] sentenceArray;
        int ctr;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        sentence = sc.nextLine();

        sentenceArray = sentence.split(" ");

        System.out.print("Reversed Sentence: ");
        for (ctr = sentenceArray.length - 1; ctr >= 0; ctr--){
            System.out.print(sentenceArray[ctr] + " ");
        }

        sc.close();
    }
}
