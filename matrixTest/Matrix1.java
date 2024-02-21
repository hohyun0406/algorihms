package matrixTest;

import java.util.Arrays;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        int r = 10;

        for (int i = 0; i < mtx.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mtx[i].length; j++) {
                    mtx[i][j] = k;
                    k++;
                }
                k = k + 5;
            } else {
                for (int j = 0; j < mtx[i].length; j++) {
                    mtx[i][j] = r;
                    r--;
                }
                r = r + 15;
            }

        }

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0;j < mtx[i].length;j++){
                System.out.print(mtx[i][j]+ " ");
            }
            System.out.println();
        }
    }
}