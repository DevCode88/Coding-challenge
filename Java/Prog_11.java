import java.util.Scanner;

// Pattern/02 x\xx\xxx
public class Prog_11 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int Pat = obj.nextInt();
        for(int i = 1; i <= Pat; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
