package Chapter3;

import java.util.Scanner;

/**
 * Matthew Golbuff
 *
 * This displays the math random command and user input and makes a very basic
 * game with it through the use of loops and boolean values.
 *
 */

public class C3_14 {

    /**
     *
     * @param args arguments received from the command line and compares them
     * through if else loops and boolean values. Then printing results to the
     * console.
     */
    static void main(String[] args) {
        int c = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.println("For heads, select 1 for tails, select 2.");
        int answer = input.nextInt();
        if (answer == 1 && c <= 5) {
            System.out.println("Congratulations! The answer was heads.");
        } else if (answer == 2 && c > 5) {
            System.out.println("Congratulations! The answer was tails");
        } else {
            System.out.println("Sorry, you are incorrect");
        }
    }
}