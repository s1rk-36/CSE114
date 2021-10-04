import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String [] args){
        double F;
        double C;

        System.out.print("Enter the degrees in Celsius: ");
        Scanner stdin = new Scanner(System.in);
        C = stdin.nextDouble();
        F = (9.0 / 5) * C + 32;

        System.out.print(C + " Celsius is " + F + " Fahrenheit");
    }
}
