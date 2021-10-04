//Kristian Hajredinaj ID:113367328

/*

0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4

 */

import java.util.Scanner;

public class Location {

    public static void main(String[] args){

        double[][] matrix = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }

        double[][] newMatrix = sortRows(matrix);
        System.out.println("The row-sorted array is:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] sortRows(double[][] m){

        double temp;
        for (int i = 0; i < m.length; i++){
            for (int k = 0; k < m[i].length; k++){
                for (int j = 0; j < m[i].length - k - 1; j++){
                    if (m[i][j] > m[i][j+1]){
                        temp = m[i][j];
                        m[i][j] = m[i][j+1];
                        m[i][j+1] = temp;
                    }
                }
            }
        }
        return m;
    }
}
