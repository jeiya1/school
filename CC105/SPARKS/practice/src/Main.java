import searching.*;
import queues.*;
import linkedlist.*;
import stacks.*;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {
                3, 7, 12, 18, 24, 27, 31, 35, 39, 42,
                45, 48, 52, 56, 60, 63, 66, 70, 74, 78,
                81, 85, 88, 91, 94, 97, 101, 105, 108, 112,
                116, 119, 123, 127, 130, 134, 137, 140, 144, 147,
                151, 155, 159, 163, 166, 170, 174, 177, 181, 185
        };
        System.out.println(Binary.binsearch(numbers, 101));
        System.out.println(Linear.linsearch(numbers, 101));
    }
}
