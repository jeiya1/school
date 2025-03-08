import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word, reverse = "";
        int ctr;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        word = sc.nextLine();

        word = word.replace(" ", "");

        for (ctr = word.length() - 1; ctr >= 0; ctr--){
            reverse += word.charAt(ctr);
        }

        if (word.equalsIgnoreCase(reverse)){
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }

        sc.close();
    }
}
