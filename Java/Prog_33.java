// Java code to illustrate pop()
//Simple Program push and pop
import java.util.*;

public class Prog_33 {
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();

        // Use add() method to add elements
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("BJS");
        STACK.push("Jain");
        STACK.push("College");

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Removing elements using pop() method
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + STACK);
    }
}
