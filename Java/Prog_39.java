
import java.util.ArrayList;
public class Prog_39 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        ArrayList<Integer> ravi = new ArrayList<>();
        StringBuilder naveen = new StringBuilder();

        // Rotate the array by k positions
//        for (int i = k; i < num.length; i++)
        for( int i = (num.length - k); i < num.length; i++ )
        {
            ravi.add(num[i]);
        }
//        for (int j = 0; j <  k; j++)
        for (int j = 0; j < (num.length - k); j++)
        {
            ravi.add(num[j]);
        }

        System.out.println(ravi); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
