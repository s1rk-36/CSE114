//Kristian Hajredinaj ID:113367328


import java.util.Scanner;

public class HW2Q4 {

    public static void main(String[] args){

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++ ){
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++ ){
                matrix2[i][j] = input.nextDouble();
            }
        }

        System.out.println("Multiplication of the matrices is: ");

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < matrix3.length; i++){
            for (int j = 0; j < matrix3[i].length; j++ ){
                matrix3[i][j] = Math.round(matrix3[i][j] * 10.0) / 10.0;
            }
        }
        for (int i = 0; i < matrix3.length; i++){
            for (int j = 0; j < matrix3[i].length; j++ ){
                System.out.print(matrix3[i][j]  + " ");
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int h = 0; h < c.length; h++) {
                    c[i][j] += a[i][h] * b[h][j];
                }
            }
        }

        return c;
    }
}
