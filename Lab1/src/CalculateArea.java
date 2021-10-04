
import java.util.Scanner;

/**
 * Student Name: Kristian Hajredinaj
 * SBU ID:
 */

public class CalculateArea {

    public static void main(String[] args) {
        // Declare your variables
        double radius;
        double area;

        // Print the instruct5ion line
        System.out.print("Enter the radius: ");

        // Create a Scanner to read an input
        Scanner stdin = new Scanner(System.in);

        // Read a double from the Scanner and store it in the radius variable
        radius = stdin.nextDouble();

        // Calculate the area (PI*r^2, or PI*r*r), then store it in the area variable
        area = radius * radius * 3.14159;

        // Print the results
        System.out.println("The area for the circle" + " of radius " + radius + " is " + area);

        // Close the scanner
        stdin.close();
    }
}