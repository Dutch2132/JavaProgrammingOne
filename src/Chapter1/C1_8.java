package Chapter1;

/**
 *
 * Matthew Golbuff
 *
 * This shows the ability of the language to compartmentalize larger equations
 * and constants through variables, allowing for larger sequences of numbers
 * which are hard for humans to remember to be simplified into memorable words.
 */
public class C1_8 {

    /**
     * Static void main
     *
     * @param args
     */

    public static void main(String[] args) {
        double radius = 5.5;
        double pi = 3.1415;
        double perimiter = 2 * radius * pi;
        double area = radius * radius * pi;
        System.out.println("The perimiter of this circle is " + perimiter + " and the area is " + area);
    }
}
