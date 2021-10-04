//Kristian Hajredinaj ID:113367328


import java.util.Random;

public class Part1 {

    public static void main(String[] args){

        int[][] matrix = new int[4][4];

        matrix = fillMatrix(matrix);

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("The largest row index: " + largestRow(matrix) + "\n");
        System.out.print("The largest column index: " + largestColumn(matrix));

    }

    public static int[][] fillMatrix(int[][] m){

        Random rd1 = new Random();
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = rd1.nextInt(2);
            }
        }

        return m;

    }

    public static int largestRow(int[][] m){

        int[] array = new int[4];
        int count = 0;
        int maxValue = 0;
        int largestRow = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] == 1){
                    count ++;
                }

            }
            if(count > maxValue){
                maxValue = count;
                largestRow = i;
            }
            count = 0;
        }

        return largestRow;

    }

    public static int largestColumn(int[][] m){

        int[][] array1 = new int[4][4];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                array1[i][j] = m[j][i];
            }
        }

        int[] array = new int[4];
        int count = 0;
        int maxValue = 0;
        int largestColumn = 0;
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[i].length; j++){
                if (array1[i][j] == 1){
                    count ++;
                }

            }
            if (count > maxValue){
                maxValue = count;
                largestColumn = i;
            }
            count = 0;
        }

        return largestColumn;

    }
}
