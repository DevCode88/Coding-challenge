// add tow array
// testing

import java.util.ArrayList;

public class Prog_40 {
    public static void main(String[] args) {
        int[] num_1 = {4, 5, 7, 0, 2};
        int[] num_2 = {1, 3, 3, 1, 2};
        int[] str = new int[10];
        byte add = 0;
        int mt = 0;
        ArrayList<Integer> data = new ArrayList<>();
        for( int i = 0; i <= num_1.length; i++){
            for( int j = 0; j <= num_2.length; j++){
                if( i == j ){
                    if( num_1[i] + num_2[j] + add < 10 ){
                        data.add(num_1[i] +num_2[j] + add);
                    }
                    System.out.println(num_1[i] + num_2[j]);
                }
            }
        }
    }
}