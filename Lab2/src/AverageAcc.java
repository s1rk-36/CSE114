import java.util.Scanner;

public class AverageAcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of v0: ");
        double v0 = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the value of v1: ");
        double v1 = input.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the value of t: ");
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);
    }
}
