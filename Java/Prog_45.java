// Duplicate values not repeat

import java.util.Scanner;
public class Prog_45 {
    void function() {
        String ch;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter values >> ");
        ch = obj.nextLine();

        int charCount = 0;

        for (int i = 0; i < ch.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (ch.charAt(i) == ch.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                charCount++;
            }
        }

        System.out.println("Distinct character count: " + charCount);

    }

    public static void main(String[] args) {
        Prog_45 obj = new Prog_45();
        obj.function();
    }
}
