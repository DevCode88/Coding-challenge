// Lower Upper and Numeric
public class Prog_09 {
    public static void main(String[] args){
        String str = "#Code whit naveen ";
        int upper = 0, lower = 0, number = 0, special = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);

        /*
            Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumeric = false;

        for (char ch : userInput.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isDigit(ch)) {
                hasNumeric = true;
            }
        }

        if (hasLowercase) {
            System.out.println("The string contains lowercase letters.");
        }
        if (hasUppercase) {
            System.out.println("The string contains uppercase letters.");
        }
        if (hasNumeric) {
            System.out.println("The string contains numeric characters.");
        }
         */
    }
}
