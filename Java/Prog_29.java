//Package import
import java.util.Arrays;
import java.util.Scanner;

public class Prog_29 {
    public static void main(String[] args){
        String name = "CyberFoxy";
//        charAt
        System.out.println("Select Index is : " + (name.charAt(3)));
//        Replace
        String name2 = name.replace('F', '0');
        System.out.println(name2);
//        Length
        System.out.println("Length is : " + (name.length()));
//        Substring
        String name3 = "Cyber Plus Foxy";
        System.out.println("Select Substring is : " + (name3.substring(0,7)));

//        Array intiger type
        int[] marks = new int[4];
        marks[0] = 98; marks[1] = 99; marks[2] = 95; marks[3] = 93;
        System.out.println(marks[3]);
//        Array boolean type
        boolean[] bool = new boolean[3];
        bool[0] = true;
        bool[1] = false;
        System.out.println(bool[0]);
//        Arrays sort
        System.out.println("Before : " + marks[0]);
        Arrays.sort(marks);
        System.out.println("After a sort : " + marks[0]);
//        for(int A = 0; A <= marks.length; A++){
//            System.out.print(marks[A] + ", ");
//        }

        int[] Eng = {44, 21, 34, 49, 38};
        Arrays.sort(Eng);
//        for (int M = 0; M <= Eng.length; M++ ){
//            System.out.print(Eng[M] + " : ");
//        }

//        Towde array
        int[][] Final = {{44, 43, 49}, {32, 43, 50}};
        int[][] FinalT = new int[2][2];
        FinalT[1][0] = 43;
        System.out.println(FinalT[1][0]);
        System.out.println(Final[0][2]);

//        Casting : Implicit/Explicit
//        Implicit
        double Price = 199.0;
        double Fprice = Price + 13.99;
        System.out.println(Fprice);

//        Explicite
        int P = 99;
        int Pf = P + (int)13.99;
        System.out.println(Pf);

//        Constants
        final float PI = 3.14F;

//        Oprators
//        Maths
        byte a1 = 8, a2 = 10;
        System.out.println("Max valus is : " + Math.max(a1, a2));
        System.out.println("Min valus is : " + Math.min(a1, a2));

//        Random
        System.out.println((int)(Math.random()*1000000));

//        Switch Statments
//        System.out.print("Input Today Date >> ");
        Scanner obj = new Scanner(System.in);
//        byte Today = obj.nextByte();
//        switch (Today){
//            case 1:
//                System.out.println("Mo"); break;
//            case 2:
//                System.out.println("Tu"); break;
//            case 3:
//                System.out.println("We"); break;
//            case 4:
//                System.out.println("Th"); break;
//            case 5:
//                System.out.println("Fr"); break;
//            case 6:
//                System.out.println("Su"); break;
//            case 7:
//                System.out.println("Sa"); break;
//            default:
//                System.out.println(" 'Roung - Input' ");
//        }

//        Do-While Loop
//        int z1 = 0;
//        do{
//            System.out.print("Input a number :- ");
//            z1 = obj.nextInt();
//            System.out.print("'Here is your number' / ");
//            System.out.println(z1);
//        }while(z1 >= 0);
//        System.out.println("THE END");

//        Continue
        int i = 0;
        while (true){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 8)
                break;
        }
    }
}