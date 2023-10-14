import java.util.Scanner;
// Pattern/10 1\23\345\5678

public class Prog_19 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        for(int i = 1; i <= number; i++){
            int values = i;
            for(int j = 1; j <= i; j++){
                System.out.print(values + " ");
                values = values + 1;
            }
            System.out.println();
        }
    }
}