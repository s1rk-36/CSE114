//Kristian Hajredinaj ID: 113367328


import java.util.Arrays;
import java.util.Scanner;
public class HW2Q3 {
    public static void main(String[] args){
        String[] cities = new String[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 cities: ");
        for (int i = 0; i < cities.length; i++){
            cities[i] = input.nextLine();
        }

        System.out.print("Sorted cities are: " + Arrays.toString(bubbleSort(cities)));
    }
    public static String[] bubbleSort(String[] cities){
        String temp;
        int i;
        int j;
        for (i = 0; i < cities.length; i++){
            for (j = 0; j < cities.length; j++){
                if (cities[i].compareTo(cities[j]) < 0) {
                    temp = cities[j];
                    cities[j] = cities[i];
                    cities[i] = temp;
                }
            }

        }
        return cities;
    }

}
