import java.util.Scanner;
// Pattern/03 111\222\333

public class Prog_12 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}