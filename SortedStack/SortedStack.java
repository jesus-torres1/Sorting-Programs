import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * Modified Java program from LinkedList to Stack that reads a list of integer numbers from the user's input
 * and saves them into a Stack sorted from smallest to largest.
 * @author Jesus Torres
 * @version 2.0.0
 */
public class SortedStack {

    /**
     * The main method of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To create a Stack to store the numbers (changed from LinkedList to Stack)
        Stack<Integer> stack = new Stack<>();

        // To read input from the user until they enter a non-integer value
        while (true) {
            System.out.print("Enter an integer (or a non-integer value to exit): ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                // To push the integer onto the Stack
                stack.push(num);
            } else {
                // To exit the loop if a non-integer value is entered
                break;
            }
        }

        // Sort the Stack in ascending order
        Collections.sort(stack);

        // To reverse the sorted Stack to get the desired order (smallest to largest)
        Collections.reverse(stack);

        // To display the sorted Stack
        System.out.println("Sorted Stack (from smallest to largest):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Pop and display the elements
        }

        // To close the scanner
        scanner.close();
    }
}

