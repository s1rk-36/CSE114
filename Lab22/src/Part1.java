//Kristian Hajredinaj ID:113367328

/*
4 2
1 7
4 5
1 2
1 1
4 1
 */

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for row and columns: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] array = new int[a][b];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextInt();
        }

        sort(array);
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void sort(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length - 1; j++) {
                if (m[j][0] > m[j + 1][0]) {
                    int temp1 = m[j][0];
                    int temp2 = m[j][1];
                    m[j][0] = m[j + 1][0];
                    m[j][1] = m[j + 1][1];
                    m[j + 1][0] = temp1;
                    m[j + 1][1] = temp2;
                }

                if (m[j][0] == m[j + 1][0]) {
                    if (m[j][1] > m[j + 1][1]) {
                        int temp3 = m[j][1];
                        m[j][1] = m[j + 1][1];
                        m[j + 1][1] = temp3;
                    }
                }
            }
        }
    }
}