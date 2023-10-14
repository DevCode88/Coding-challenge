import java.util.Scanner;

class Prog_32 {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int par,count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        int input = scanner.nextInt();
        for(int i = 0; i <= num.length; i++)
        {
            if(num[i] == input){
                count = count + 1;
                break;
            }
            par = (count / num.length) * 100;
            System.out.println(par);
        }

    }
}
