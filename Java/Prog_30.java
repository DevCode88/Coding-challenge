import java.util.Scanner;

public class Prog_30 {
    public static void main(String[] args){
        int[] numbers = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.print(">> ");
        int input = obj.nextInt();
        int par = (numbers.length/input) * 10 ;
        System.out.println("Total Par : " + par + "%");
    }
}