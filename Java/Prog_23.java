import java.util.Scanner;
// Pattern / 14 = 0123/123/23/3
public class Prog_23 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int number = obj.nextInt();
        for(int i = 0; i <= number; i++){
            for(int j = i; j <= number; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
