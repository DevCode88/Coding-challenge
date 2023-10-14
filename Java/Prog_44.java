import java.util.Random;

//  Random number add new array
public class Prog_44 {
    private static final String[] TEXT_COLORS = {
            "\u001B[92m",
    };
    void DataRead() throws InterruptedException {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 , 10 };
        int[] test_nums;
        Random random = new Random();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for( int next : nums ){

            int randomColorIndex = random.nextInt(TEXT_COLORS.length);
            String randomColor = TEXT_COLORS[randomColorIndex];
            String resetColor = "\u001B[0m"; // Reset to default color

            nums[next] = ( int ) ( Math.random() * nums.length );
            System.out.print(randomColor + nums[next] + randomColor + " ");

            Thread.sleep(1000); // Pause for 1 second before printing next iteration
//            System.out.print("\r"); // Move cursor back to the beginning of the line
        }

    };


    public static void main(String[] args) throws InterruptedException {
        Prog_44 Obj = new Prog_44();
        Obj.DataRead();
    }
}
