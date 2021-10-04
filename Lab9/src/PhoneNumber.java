//Kristian Hajredinaj ID:113367328
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args) {
        String PhoneNum;
        System.out.print("Enter the phone number: ");
        Scanner input = new Scanner(System.in);
        PhoneNum = input.nextLine();
        List<Character> chars = new ArrayList<>();
        for (char ch : PhoneNum.toCharArray()) {
            chars.add(ch);
        }
            while (chars.size() > 10 || chars.size() < 10) {
                System.out.println("Invalid number");
                System.out.println("Enter a valid number: ");

                PhoneNum = input.nextLine();
                chars = new ArrayList<>();

                for (char ch1 : PhoneNum.toCharArray()) {
                    chars.add(ch1);
                }
                if (chars.size() == 10) {
                    break;
                }
            }
            input.close();
            System.out.print("Formatted phone number : " + "(" + String.valueOf(chars.get(0)) + String.valueOf(chars.get(1)) + String.valueOf(chars.get(2)) + ")" + String.valueOf(chars.get(3)) +
                    String.valueOf(chars.get(4)) + String.valueOf(chars.get(5)) + "-" + String.valueOf(chars.get(6)) + String.valueOf(chars.get(7)) + String.valueOf(chars.get(8)) + String.valueOf(chars.get(9)));
        }
    }
