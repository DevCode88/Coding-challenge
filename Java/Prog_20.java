import java.util.Scanner;
// Pattern/11 1\21\321\4321

public class Prog_20 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int number = obj.nextInt();
        for(int i = 0; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i - j + 1 + " ");
            }
            System.out.println();
        }
    }
}
