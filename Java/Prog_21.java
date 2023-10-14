import java.util.Scanner;
// Pattern/12 aaa\bbb\ccc

public class Prog_21 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> "); int number = obj.nextInt();
        for(int row = 1; row <= number; row++){
            for(int col = 1; col <= number; col++){
                char ch = Character.highSurrogate('A' + row - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
