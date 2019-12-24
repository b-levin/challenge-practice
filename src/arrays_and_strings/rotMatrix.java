package arrays_and_strings;

public class rotMatrix {

    public static int[][] rotateMatrix(int[][] in) {
        /*
        rotates the inputted matrix 90 degs to the right
        challenge: in place rot
        in = 1 2 3
             4 5 6
             7 8 9
        out = 7 4 1
              8 5 2
              9 6 3
         */
        int[][] out = new int[in.length][in.length];
        int outPos = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = in.length - 1; j >= 0; j--) {
                out[i][outPos] = in[j][i];
                outPos++; 
            }
            outPos = 0;
        }
        return out;
    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = rotateMatrix(m1);
        print2dArray(m2);
    }
}
