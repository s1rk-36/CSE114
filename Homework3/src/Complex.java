//Kristian Hajredinaj ID:113367328

import java.util.Scanner;

public class Complex {

    private double realNumber;
    private double imaginaryNumber;

    public Complex(){
        realNumber = 1.0;
        imaginaryNumber = 1.0;
    }

    public Complex(double realNumber, double imaginaryNumber){
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getRealNumber(){
        return realNumber;
    }

    public double getImaginaryNumber(){
        return imaginaryNumber;
    }

    public Complex add(Complex c){
        double real = c.realNumber + getRealNumber();
        double imag = c.imaginaryNumber + getImaginaryNumber();
        return new Complex(real, imag);
    }

    public Complex subtract(Complex c){
        double real = getRealNumber() - c.realNumber;
        double imag = getImaginaryNumber() - c.imaginaryNumber;
        return new Complex(real, imag);
    }

    public void print(){
        System.out.println("("+ getRealNumber() + ", " + getImaginaryNumber() + ")");
    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter real part of the first complex number: ");
        double a1 = input.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double b1 = input.nextDouble();
        System.out.print("Enter real part of the second complex number: ");
        double a2 = input.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double b2 = input.nextDouble();


        Complex c1 = new Complex(a1, b1);
        System.out.print("First complex number is: ");
        c1.print();

        Complex c2 = new Complex(a2, b2);
        System.out.print("Second complex number is: ");
        c2.print();

        Complex c3 = c1.add(c2);
        System.out.print("Addition of the complex numbers is: ");
        c3.print();

        Complex c4 = c1.subtract(c2);
        System.out.print("Subtraction of the complex numbers is: ");
        c4.print();

    }
}
