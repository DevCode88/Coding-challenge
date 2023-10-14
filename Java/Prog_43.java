import java.util.Random;

// Create Array and move next location and clear last location values
public class  Prog_43 {

    private static final String[] TEXT_COLORS = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[34m", // Blue
            "\u001B[33m", // Yellow
             "\u001B[35m", // Purple
            "\u001B[36m",
            "\u001B[37m",
            "\u001B[38m",
            "\u001B[92m",
    };
    public static void main(String[] args) throws InterruptedException {
      int[] arraySize = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//      for(int next : arraySize){
//          arraySize[next] = (int) (Math.random() * arraySize.length);
//      }

//        for (int i = 0; i < arraySize.length; i++) {
////             Random values between 0 to Array Size
//            arraySize[i] = (int) (Math.random() * arraySize.length);
//        }

        int Index = 0;

        // Display array next values
        printArray(arraySize, Index);

        for (int step = 1; step <= arraySize.length; step++) {
            // Clear the last index value
            arraySize[Index] = 0;

            // Move to the next location
            Index = (Index + 1) % arraySize.length;

            // Display screen
            printArray(arraySize, Index);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printArray(int[] array, int currentIndex) throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            int randomColorIndex = 0;
//            int randomColorIndex = random.nextInt(TEXT_COLORS.length);
            String randomColor = TEXT_COLORS[randomColorIndex];
            String resetColor = "\u001B[0m";
            if (i == currentIndex) {
                System.out.print(randomColor + "[" + array[i] + "] " + randomColor);
                Thread.sleep(1500);
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
