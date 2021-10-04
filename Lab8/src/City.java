//Kristian Hajredinaj ID:113367328

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class City {
    public static void main(String [] args){
        String city1, city2, city3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        city1 = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second city: ");
        city2 = input.nextLine();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the third city: ");
        city3 = input.nextLine();
        String strArray[] = new String[3];
        strArray[0] = city1;


        strArray[1] = city2;


        strArray[2] = city3;


        strArray = Stream.of(strArray).sorted().toArray(String[]::new);


        System.out.print("Strings in Sorted Order: " + Arrays.toString(strArray));
    }
}
