import java.lang.reflect.Array;
import java.util.Arrays;
public class Prog_46 {
    void function() {
        int[] num_1 = {3, 1, 4};
        int[] num_2 = {5, 2,7};
        int x = num_1.length;
        int y = num_2.length;
        int[] result = new int[x + y];
        System.out.println(" length : " + result.length);
        int pos = 0;
        for(int element: num_1){
            result[pos]= element;
            pos++;
        }
        for(int element: num_2){
            result[pos]= element;
            pos++;
        }
        System.out.println(" Before : "+ Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(" After  : " + Arrays.toString(result));
        String ans = Arrays.toString(result);
        System.out.println(ans);

        float floatNumber = x+y;
           if(ans.length() % 2 == 0){
               float abc = floatNumber / 2;
               int intNumber = (int) abc;
               System.out.println(result[intNumber-1]);
               System.out.println(result[intNumber]);
//               System.out.println("Ans : " + (result[intNumber] + result[intNumber] - .50) / 2.00 );
           }
           else {
               float abc = floatNumber / 2;
               abc = abc - 0.5f;
               int intNumber = (int) abc;
               System.out.println(result[intNumber]);
//               System.out.println("Ans : " + (result[intNumber] + result[intNumber] ) / 2.00 );


           }

    }


    public static void main(String[] args) {
        Prog_46 obj = new Prog_46();
        obj.function();
    }
}
