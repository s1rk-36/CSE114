//Kristian Hajredinaj ID:113367328

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled(True/False): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle);
        System.out.println("The Area of the Triangle is: " + triangle.getArea());
        System.out.println("The Perimeter of the Triangle is: " + triangle.getPerimeter());
        System.out.println("The color is: " + triangle.getColor());
        System.out.println("The triangle is " + (triangle.isFilled() ? "filled": "not filled"));
    }
}
