/*
 * HW 2:
 * Author: Christopher White
 */
package quadratic_equations;

/* Import libraries*/
import java.util.Scanner; //keyboard scanner
import java.lang.Math;  // for squareroot

public class Quadratic_equations {

    // create a method to read in the keyboard input
    // values are stored in an array of size = 3
    public static void read_user_input(double[] array, final int sz) {

        Scanner kybd = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");

        // read in each number with a for loop for each index of the array
        for (int index = 0; index < sz; index++) {
            array[index] = kybd.nextInt();
        }
    }

    //quadratic equation method
    public static void quadratic_equation(double[] input_array, String output) {

        double discriminant = Math.sqrt((input_array[1] * input_array[1]) - (4 * input_array[0] * input_array[2]));

        if (discriminant > 0) {
            // if b^2 - 4ac is positive the equation has 2 roots
            int sz = 2;
            double[] output_array = new double[sz];
            output_array[0] = (-input_array[1] + discriminant) / (2 * input_array[0]);
            output_array[1] = (-input_array[1] - discriminant) / (2 * input_array[0]);
            System.out.println("\nThe equation has two roots: " + output_array[0] + " and " + output_array[1]);

        } else if (discriminant == 0) {
            // if b^2 - 4ac is equal to zero it has one root
            int sz = 1;
            double[] output_array = new double[sz];
            output_array[0] = (-input_array[1] + discriminant) / (2 * input_array[0]);

            System.out.println("\nThe equation has one root: " + output_array[0]);
        } else {
            // if b^2 - 4ac is negative it has no real roots
            System.out.println("\nThe equation has no real roots");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // variables
        final int input_size = 3;

        String output = "";

        // initialize a new array
        double[] input_array = new double[input_size];

        read_user_input(input_array, input_size);
        quadratic_equation(input_array, output);

    }
}
