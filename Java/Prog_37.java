import java.net.Socket;
import java.util.Arrays;

// Find Duplicate values in Array.
public class Prog_37 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 5, 9, 10 };
        boolean Duplicate = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found: " + numbers[i]);
                    Duplicate = true;
                }
            }
        }
        if (!Duplicate) {
            System.out.println("No duplicates found.");
        }
    if(!Duplicate){
        System.out.println("args = " + Arrays.toString(args));
    }
    }

}