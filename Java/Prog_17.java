import java.util.Scanner;
// Pattern/08 1/22/333/444

public class Prog_17 {
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