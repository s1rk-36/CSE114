//Kristian Hajredinaj ID: 113367328
import java.util.Scanner;
public class Pattern {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern(int n) {
        int space = n - 1;
        for (int k = 1; k <= n; k++) {
            for (int p = 0; p < space; p++) {
                System.out.print("\t");
            }
            for (int i = k; i > 0; i--) {
                System.out.print(i + "\t");
            }
            System.out.println();
            space--;
        }
    }
}
