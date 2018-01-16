package Chapter2;

/**
 * Matthew A Golbuff
 */
import java.util.Scanner;

public class C2_5 {

    /**
     * This method does the math to determine the total of the meal minus tax
     * and a suggested tip for the waiter/waitress.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of meal in USD");
        double price = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = gratuityRate / 100 * price;
        System.out.println("The Subtotal is: " + price + ".");
        System.out.println("The tip is " + gratuity);
    }
}
