//Kristian Hajredinaj ID:113367328

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HW2Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String palindrome = input.nextLine();

        List<Character> chars = new ArrayList<>();
        List<Character> checker = new ArrayList<>();

        for (int i = 0; i < palindrome.length(); i++){
            chars.add(palindrome.charAt(i));
        }

        for (int k = 0; k < palindrome.length(); k++){
            checker.add(palindrome.charAt(palindrome.length() - 1 - k));
        }

        chars.removeAll(Collections.singleton(Character.valueOf(' ')));
        checker.removeAll(Collections.singleton(Character.valueOf(' ')));
        chars.replaceAll(Character::toUpperCase);
        checker.replaceAll(Character::toUpperCase);

        boolean pal = false;

            if (chars.equals(checker))
                pal = true;
            else
                pal = false;

        if (pal)
            System.out.print("The string " + palindrome + " is a palindrome");
        else
            System.out.print("The string " + palindrome + " is NOT a palindrome");

        }
    }

