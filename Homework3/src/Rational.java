//Kristian Hajredinaj ID:113367328


import java.util.Scanner;

public class Rational {

    private int numerator;
    private int denominator;

    public Rational(int numerator){
        this(numerator , 1);
    }

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        for (int i = 1; i <= Math.min(Math.abs(numerator), Math.abs(denominator)); i++){
            if (getNumerator() % i == 0 && getDenominator() % i ==0){
                this.numerator = getNumerator() / i;
                this.denominator = getDenominator() / i;
            }
        }
    }

    public Rational(){
        this(0, 1);
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public Rational add(Rational r){
        int numerator = getNumerator() * r.denominator + getDenominator() * r.numerator;
        int denominator = getDenominator() * r.denominator;
        return new Rational(numerator, denominator);
    }

    public Rational subtract(Rational r){
        int numerator = getNumerator() * r.denominator - getDenominator() * r.numerator;
        int denominator = getDenominator() * r.denominator;
        return new Rational(numerator, denominator);
    }

    public Rational multiply(Rational r){
        int numerator = getNumerator() * r.numerator;
        int den = getDenominator() * r.denominator;
        return new Rational(numerator, den);
    }

    public Rational divide(Rational r){
        int den = getDenominator() * r.numerator;
        int num = getNumerator() * r.denominator;
        return new Rational(num, den);
    }

    public void print(){

        if (getNumerator() == 0){
            System.out.println(getNumerator());
        } else
            System.out.println("(" + getNumerator() + ", " + getDenominator() + ")");
    }

    public static void main(String[] args){

        int a1, b1, a2, b2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numerator for the first rational number: ");
        a1 = input.nextInt();

        System.out.print("Enter a non-zero denominator for the first rational number: ");
        b1 = input.nextInt();
        while (b1 == 0 ){
            System.out.println("Enter a non-zero value for the first denominator: ");
            b1 = input.nextInt();
        }
        System.out.print("Enter numerator for the second rational number: ");
        a2 = input.nextInt();

        System.out.print("Enter a non-zero denominator for the second rational number: ");
        b2 = input.nextInt();
        while ( b2 == 0) {
            System.out.println("Enter a non-zero value for the second denominator: ");
            b2 = input.nextInt();
        }

        Rational r1 = new Rational(a1, b1);
        System.out.print("First rational number is: ");
        r1.print();

        Rational r2 = new Rational(a2, b2);
        System.out.print("Second rational number is: ");
        r2.print();

        Rational r3 = r1.add(r2);
        System.out.print("Addition of the rational numbers is: ");
        r3.print();

        Rational r4 = r1.subtract(r2);
        System.out.print("Subtraction of the rational numbers is: ");
        r4.print();

        Rational r5 = r1.multiply(r2);
        System.out.print("Multiplication of the rational numbers is: ");
        r5.print();

        Rational r6 = r1.divide(r2);
        System.out.print("Division of the rational numbers is: ");
        r6.print();

    }
}
