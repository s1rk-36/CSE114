//Kristian Hajredinaj ID:113367328

//9.0 4.0 3.0 -5.0 -6.0 -21.0
//1.0 2.0 2.0 4.0 4.0 5.0


import java.util.Scanner;

public class TestLinearEquation {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f;
        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()){
            System.out.print("X is " + equation.getX() + " and Y is " + equation.getY());
        }
        else
            System.out.print("The equation has no solutions.");
    }
}
