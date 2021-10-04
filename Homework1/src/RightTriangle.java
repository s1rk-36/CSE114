//Kristian Hajredinaj SBU ID:113367328

import java.util.Scanner;
public class RightTriangle {
    public static void main(String [] args){
        int side1, side2, side3;
        System.out.print("Side 1: ");
        Scanner stdin = new Scanner(System.in);
        side1 = stdin.nextInt();
        System.out.print("Side 2: ");
        Scanner stdin1 = new Scanner(System.in);
        side2 = stdin1.nextInt();
        System.out.print("Side 3: ");
        Scanner stdin2 = new Scanner(System.in);
        side3 = stdin2.nextInt();
        if(Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)){
            System.out.print("Input sides represent a right triangle!");
        } else{
            System.out.print("Input sides do not represent a right triangle!");
        }
    }
}
