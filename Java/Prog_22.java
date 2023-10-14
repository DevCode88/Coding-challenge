import java.util.Scanner;
// Pattern/ 13 = */**/***/**/*
public class Prog_22 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int number = obj.nextInt();
        for(int i = 0; i <= number; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = number; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
