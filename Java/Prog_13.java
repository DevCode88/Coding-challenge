import java.util.Scanner;
// Pattern/04 1234\1234\1234

public class Prog_13 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print(j + " ");;
            }
            System.out.println();
        }
    }
}