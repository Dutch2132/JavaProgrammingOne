package Chapter3;

/**
 * Matthew Golbuff
 *
 * This program is supposed to test if a number is divisible by 2 set integers
 * and determine if it falls within that boundary or on one or the other,
 */
import java.util.Scanner;

public class C3_26 {

    /**
     * Main Method
     *
     * @param args Arguments from command line prompt and runs them through
     * multiple scenarios and report the final status of said scenarios.
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int test = input.nextInt();
        if (test % 5 == 0 ^ test % 6 == 0) {
            System.out.println("The number is divisible by 5 and 6.");
        } else if (test % 5 == 0 && test % 6 != 0) {
            System.out.println("The number is only divisible by 5.");
        } else if (test % 5 != 0 && test % 6 == 0) {
            System.out.println("The number is only divisible by 6.");
        }
    }
}
