package Chapter2;

/**
 *
 * Matthew A Golbuff
 *
 * The purpose of this is to mix variables and numbers As well as showcase the
 * Scanner function which allows the Program to receive and implement user input
 */
import java.util.Scanner;

public class C2_1 {

    /**
     * The main point of this method is to do the math and display the final
     * product.
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius value");
        double celsius = input.nextDouble();
        double farenheit = celsius * 9.0 / 5 + 32;
        System.out.println(celsius + " degrees celsius is " + farenheit + " Degrees Farenheit.");
    }
}
