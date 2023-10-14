import java.util.Scanner;
//Pattern/ 16 = --*--/-**-/***
public class Prog_26 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> ");
        int number = obj.nextInt();
        int row = 1;
        while(row <= number){
            for(int space = number - row; space > 0; space--){
                System.out.print(" ");
            }
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
