import java.util.Scanner;
// Pattern/05 4321\4321\4321

public class Prog_14 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        for(int i = 1; i <= number; i++){
            for(int j = number; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}