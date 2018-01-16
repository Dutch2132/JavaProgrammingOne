package Chapter3;

/**
 * Matthew Golbuff
 *
 * This program is supposed to allow you to compare prices per pound of food.
 */
import java.util.Scanner;

public class C3_33 {

    /**
     *
     * @param args
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight of the item / number of servings.");
        double servingsP1 = input.nextDouble();
        System.out.println("Now please enter the cost of the item.");
        double costP1 = input.nextDouble();
        System.out.println("Please enter the weight of the second item/ number of servings.");
        double servingsP2 = input.nextDouble();
        System.out.println("The cost of the second item?");
        double costP2 = input.nextDouble();
        double pricePerServing1 = costP1 / servingsP1;
        double pricePerServing2 = costP2 / servingsP2;
        if (pricePerServing1 > pricePerServing2) {
            System.out.println("Item two has a better price.");
        } else if (pricePerServing1 < pricePerServing2) {
            System.out.println("Item one has a better price.");
        } else {
            System.out.println("The cost is proportionally identical or invalid data was used.");
        }
    }
}
