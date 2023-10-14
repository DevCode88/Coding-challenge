import java.util.Random;

// Create Array and move next location and clear last location values
public class  Prog_42 {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];

        // Initialize the array with random values
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100); // Random values between 0 and 99
        }

        int currentIndex = 0;

        // Display the initial state of the array
        printArray(array, currentIndex);

        for (int step = 1; step <= arraySize; step++) {
            // Clear the previous location's value
            array[currentIndex] = 0;

            // Move to the next location
            currentIndex = (currentIndex + 1) % arraySize;

            // Display the updated state of the array
            printArray(array, currentIndex);

            try {
                Thread.sleep(1000); // Pause for 1 second between steps
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printArray(int[] array, int currentIndex) {

        for (int i = 0; i < array.length; i++) {
            if (i == currentIndex) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
