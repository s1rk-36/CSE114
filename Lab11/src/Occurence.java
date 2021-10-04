//Kristian Hajredinaj ID:113367328
import java.util.Scanner;
public class Occurence {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = input1.next().charAt(0);
        System.out.println("The number of occurrences of \'" + a +"\' in \"" + str + "\" is " + count(str,a));
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
