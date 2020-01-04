package amazon;

public class num_islands {

    /*
    Given a boolean 2D matrix, 0 is represented as the sea, 1 is represented as the island. If two 1 is adjacent, we consider them in the same island. We only consider up/down/left/right adjacent.
    Find the number of islands.
    Input:
        [
        [1,1,0,0,0],
        [0,1,0,0,1],
        [0,0,0,1,1],
        [0,0,0,0,0],
        [0,0,0,0,1]
        ]
    Output:
        3

    Input:
        [
        [1,1]
        ]
    Output:
        1
    */

    public static int numIsland(int[][] arr) {
        //need to acount for 1x2 or 2x1 arrs
        int out = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if (arr[i][j] == 1) { 
                    if (arr[i][j+1] ==  1) {
                        out++;
                    }
                    if (arr[i+1][j] == 1) {
                        out++;
                    }
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] in1 = {{1, 1, 0, 0, 0},
                       {0, 1, 0, 0, 1},
                       {0, 0, 0, 1, 1},
                       {0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 1}};
        System.out.println(numIsland(in1));
        int[][] in2 = {{1, 1}};
        System.out.println(numIsland(in2));
    }
}