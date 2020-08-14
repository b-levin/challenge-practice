package arrays_and_strings;

import java.util.*;

public class zeroMat {
    
    /*changes entire row and col of matrix with 0 present to all 0s
    in: 1 1 1
        2 0 2
        3 3 3
    out: 1 0 1
         0 0 0
         3 0 3
    */

    //zeros col
    public static void zeroCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    //zeros row
    public static void zeroRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[row][j] = 0;
        }
    }

    //zeros the matrix
    public static void zeroMatrix(int[][] matrix) {
        ArrayList<Integer[]> zeroPos = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    Integer[] pos = {i, j};
                    zeroPos.add(pos);
                }
            }
        }
        for(Integer[] pos : zeroPos) {
            zeroCol(matrix, pos[1]);
            zeroRow(matrix, pos[0]);
        }
    }

    //prints 2d matrix
    public static void print2dMat(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String args[]) {
        int[][] in1 = {{1, 1, 1}, {2, 0, 2}, {3, 3, 3}};
        System.out.println("Input:");
        print2dMat(in1);
        zeroMatrix(in1);
        System.out.println("Output:");
        print2dMat(in1);
    }
}