//Kristian Hajredinaj ID:113367328

import java.util.Scanner;

public class TestMyInteger {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        MyInteger num1 = new MyInteger(a);
        MyInteger num2 = new MyInteger(b);
        MyInteger num3 = new MyInteger(c);

        System.out.print("Number 1 = " + num1.getValue() + " is Prime : " + num1.isPrime() + " is Odd: " +  num1.isOdd() +
                " is Even: " + num1.isEven() + "\n");
        System.out.print("Number 2 = " + num2.getValue() + " is Prime : " + num2.isPrime() + " is Odd: " +  num2.isOdd() +
                " is Even: " + num2.isEven() + "\n");
        System.out.print("Number 3 = " + num3.getValue() + " is Prime : " + num3.isPrime() + " is Odd: " +  num3.isOdd() +
                " is Even: " + num3.isEven() + "\n");
        System.out.print("Num 1 == Num 2: " + num1.equals(num2) + "\n");
        System.out.print("Num 2 == Num 3: " + num2.equals(num3) + "\n");
        System.out.printf("Num 1 == Num 3: " + num1.equals(num3) + "\n");
        System.out.println();
        System.out.print("Number 1 = " + num1.getValue() + " is Prime : " + MyInteger.isPrime(a) + " is Odd: " +  MyInteger.isOdd(a) +
                " is Even: " + MyInteger.isEven(a) + "\n");
        System.out.print("Number 2 = " + num2.getValue() + " is Prime : " + MyInteger.isPrime(b) + " is Odd: " +  MyInteger.isOdd(b) +
                " is Even: " + MyInteger.isEven(b) + "\n");
        System.out.print("Number 3 = " + num3.getValue() + " is Prime : " + MyInteger.isPrime(c) + " is Odd: " +  MyInteger.isOdd(c) +
                " is Even: " + MyInteger.isEven(c) + "\n");


    }
}
