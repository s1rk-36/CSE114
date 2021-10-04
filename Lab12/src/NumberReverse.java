//Kristian Hajredinaj ID:113367328
import java.util.Scanner;
public class NumberReverse {
    public static void main(String [] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = stdin.nextInt();
        reverse(input);
    }
    public static void reverse(int number){
        while(number > 0){
            System.out.print(number%10);
            number = number / 10;
        }
    }
}
