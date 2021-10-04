import java.util.Scanner;
public class Shipping {
    public static void main(String [] args){
        double w;
        System.out.println("Enter the weight of the package: ");
        Scanner stdin = new Scanner(System.in);
        w = stdin.nextDouble();
        if ( w <= 0.0){
            System.out.println("Invalid input");
        } else if(w > 20.0){
            System.out.println("The package cannot be shipped");
        } else if( 0.0 < w && w <= 1.0){
            System.out.println("The shipping cost will be 3.5");
        } else if(1.0 < w && w <= 3.0){
            System.out.println("The shipping cost will be 5.5)");
        } else if(3.0 < w && w <= 10.0){
            System.out.println("The shipping cost will be 8.5");
        } else if(10.0 < w && w <= 20.0){
            System.out.println("The shipping cost will be 10.5");
        }
    }
}
