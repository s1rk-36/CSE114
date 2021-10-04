import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String [] args){
        double M;
        double intTemp;
        double finalTemp;
        double Q;

        System.out.print("Enter the amount of water in kilograms: ");
        Scanner input = new Scanner(System.in);
        M = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        Scanner input2 = new Scanner(System.in);
        intTemp = input2.nextDouble();

        System.out.print("Enter the final temperature: ");
        Scanner input3 = new Scanner(System.in);
        finalTemp = input3.nextDouble();

        Q = M * (finalTemp - intTemp) * 4184;
        System.out.print("The energy needed is " + Q);
    }
}
