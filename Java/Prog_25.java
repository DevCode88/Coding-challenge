import java.util.Scanner;
// Pattern / 15 = ---*/--**/-***/****
public class Prog_25 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int number = obj.nextInt();
        int row = 1;
        while(row <= number){
            int space = number - row;
            while (space > 0){
            System.out.print("  ");
            space = space - 1;
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
