import java.util.Scanner;
// Pattern/06 123\456\789

public class Prog_15 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.printf("> "); int number = obj.nextInt();
        int count = 1;
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print(count + " ");
                count++;
            }
        System.out.println();
        }
    }
}