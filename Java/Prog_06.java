import java.util.Scanner;

// Find number 1 to 10 inclusive
// Fibonacci series
public class Prog_06 {
    public static void main(String[] args){
      Scanner obj = new Scanner(System.in);
        System.out.print("> ");
         int n = obj.nextInt();
         int sum = 0;
         int number = 1;
         while (number <= n) {
                 sum += number;
                 number++;
         }
             System.out.println("'Ans' " + sum);
         if (n == 0){
             System.out.println("Output is zero'");
         }
    }
}
