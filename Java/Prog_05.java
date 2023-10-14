// Even and Odd number print in loop
public class Prog_05 {
    public static void main(String[] args){
        int n = 0;
        while (n <= 10){
            if(n % 2 == 0){
                System.out.println("'Even' " + n);
            } else if (n % 2 != 0 ) {
                System.out.println("'Odd'  " + n);
            }
            n++;
        }
    }
}
