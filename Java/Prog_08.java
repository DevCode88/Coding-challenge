// Prime and not
import javax.swing.*;
import java.util.Scanner;
public class Prog_08 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("> ");
        int n = obj.nextInt();
        int number = 2;
            if (n % number == 1){ System.out.println("prime number");
        } else if (n % number == 0) { System.out.println("not a Prime");
        }

            int i = 2;
            while (i < n){
                if( n % i == 0){
                    System.out.println(i + " is not prim number");
                }
                else{
                    System.out.println(i + " Prime number");
                }
                i++;
            }
    }
}
