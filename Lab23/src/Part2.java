//Kristian Hajredinaj ID:113367328

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary value: ");
        String value = input.nextLine();

        System.out.println(bin2Dec(value));
    }

    public static int bin2Dec(String binaryString) {
        return binaryToDecimal(binaryString, binaryString.length() - 1);
    }

    public static int binaryToDecimal(String binaryString, int high) {
        if (high < 0)
            return 0;
        else
            return binaryToDecimal(binaryString, high - 1) * 2
                    + (binaryString.charAt(high) - '0');  }
}

