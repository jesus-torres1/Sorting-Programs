import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A Java program that reads a list of integer numbers from the user's input
 * and saves them into a LinkedList sorted from smallest to largest.
 * @author Jesus Torres
 * @version 1.0.0
 */
public class SortLinkedList {

    /**
     * The main method of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To create a LinkedList to store the numbers
        LinkedList<Integer> numbers = new LinkedList<>();

        // To read input from the user until they enter a non-integer value
        while (true) {
            System.out.print("Enter an integer (or a non-integer value to exit): ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                // To add the integer to the LinkedList
                numbers.add(num);
            } else {
                // To exit the loop if a non-integer value is entered
                break;
            }
        }

        // To sort the LinkedList in ascending order
        Collections.sort(numbers);

        // To display the sorted LinkedList
        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // To close the scanner
        scanner.close();
    }
}

