import java.util.Random;

public class Prog_41 {

    private static final String[] TEXT_COLORS = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[34m", // Blue
            "\u001B[33m", // Yellow
            "\u001B[35m", // Purple
            "\u001B[36m",
            "\u001B[37m",
            "\u001B[38m",
    };

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        while (true) {
            int randomColorIndex = random.nextInt(TEXT_COLORS.length);
            String randomColor = TEXT_COLORS[randomColorIndex];
            String resetColor = "\u001B[0m"; // Reset to default color

            System.out.print(randomColor + "Software Developer" + resetColor);
            Thread.sleep(50); // Pause for 1 second before printing next iteration
            System.out.print("\r"); // Move cursor back to the beginning of the line
        }
    }
}
