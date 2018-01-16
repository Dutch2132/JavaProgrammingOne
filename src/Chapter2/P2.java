package Chapter2;

/**
 * Matthew Golbuff
 *
 * This program is meant to add up the full price of a full meal and calculate
 * the tip
 */
import java.util.Scanner;

public class P2 {

    /**
     * The method tracks the entire total of the meal and applies the tax and
     * gratuity through 3 variables from user input.
     *
     * @param args
     */
    public static void main(String[] args) {
        double taxes = 10;
        double priceTip = 15;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Price of Entree ");
        double priceMeal = input.nextDouble();
        System.out.println("Enter Price of Drinks ");
        double priceDrinks = input.nextDouble();
        System.out.println("Enter Price of Dessert ");
        double priceDessert = input.nextDouble();
        double priceFood = priceMeal + priceDrinks + priceDessert;
        double totalTaxes = priceFood * (taxes / 100);
        double totalTip = (priceFood + totalTaxes) * priceTip / 100;
        double grandTotal = priceFood + totalTaxes + totalTip;
        System.out.println("The meal was: " + grandTotal + " The tax total is: "
                + totalTaxes + " The total with tip is: " + totalTip);
    }
}
