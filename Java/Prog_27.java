import javax.sound.sampled.Line;
import java.util.Scanner;

//String Text Space
public class Prog_27 {
    public static void main(String[] args){
        String sentence = "Hello i'm Naveen Suthar";
        String targetWord = "Naveen";

        // Split the sentence into individual words
        String[] words = sentence.split(" ");

        // Iterate over the words and add a double space to the target word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(targetWord)) {
                result.append(word).append("  "); // Adding double space to target word
            } else {
                result.append(word).append(" + ");
            }
        }

        // Display the modified sentence
        System.out.println(result.toString().trim());
    }
}
