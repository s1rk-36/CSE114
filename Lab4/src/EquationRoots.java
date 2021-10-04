import java.util.Scanner;
import java.lang.Math;

public class EquationRoots {
    public static void main(String [] args){
        double a;
        double b;
        double c;


        System.out.print("Enter the value of a: ");
        Scanner stdin = new Scanner(System.in);
        a = stdin.nextDouble();

        System.out.print("Enter the value of b: ");
        Scanner stdin1 = new Scanner(System.in);
        b = stdin1.nextDouble();

        System.out.print("Enter the value of c: ");
        Scanner stdin2 = new Scanner(System.in);
        c = stdin2.nextDouble();

        double dcr = Math.pow(b , 2.0) - (4.0 * a * c);
        double FR = ((- b) + (Math.pow(dcr, 0.5))) / (2.0 * a);
        double SR = ((- b) - (Math.pow(dcr, 0.5))) / (2.0 * a);
        if(dcr > 0.0){
            System.out.println("The equation has two roots: " + FR + " and " + SR);
        } else if(dcr == 0){
            System.out.println("The equation has one root: " + FR);
        } else{
            System.out.println("The equation has no real roots");

        }
    }
}
