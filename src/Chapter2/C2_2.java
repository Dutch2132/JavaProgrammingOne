package Chapter2;

/**
 *
 * Matthew A Golbuff
 *
 */
import java.util.Scanner;

public class C2_2 {

    /**
     * This method holds the math and scanner input and do all of the math and
     * display to the screen.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Enter radius in cm.");
        double radius = input.nextDouble();
        double area = (radius * radius) * pi;
        System.out.println("Enter length ");
        double length = input.nextDouble();
        double volume = area * length;
        System.out.println("the area is " + area + " and the volume is " + volume + ".");
    }
}
