//Kristian Hajredinaj ID: 113367328

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.print("The average value is: " + average.getAsDouble());
    }
}