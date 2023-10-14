import java.util.Scanner;

// Find Factorial Number
public class Prog_07 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> ");
        int number = obj.nextInt();  // the number whose factorial we want to find
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + number + " is " + result);
    }
}
