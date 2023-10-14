import java.util.Scanner;
// Pattern/07 1/23/456

public class Prog_16 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}