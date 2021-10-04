//Kristian Hajredinaj ID: 113367328

import java.util.*;

public class HW2Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String anagram1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String anagram2 = input.nextLine();


        if(isAnagram(anagram1, anagram2))
            System.out.print(anagram1 + " and " + anagram2 + " are anagrams");
        else
            System.out.print(anagram1 + " and " + anagram2 + " are NOT anagrams");

    }

    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        if (string1.length() != string2.length())
            return false;
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

}


