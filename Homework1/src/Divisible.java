//Kristian Hajredinaj ID: 113367328
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        int number;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = stdin.nextInt();
        boolean var1 = false;
        boolean var2 = false;

        if (number % 5 == 0) {
            var1 = true;
        }

        if (number % 6 == 0) {
            var2 = true;
        }

        System.out.println("Is 10 divisible by 5 and 6? " + (var1 && var2));
        System.out.println("Is 10 divisible by 5 or 6? " + (var1 || var2));
        System.out.println("Is 10 divisible by 5 or 6, but not both? "
                + (var1 ^ var2));

    }
}
