package Problems;

import org.junit.Test;

import java.util.Arrays;

public class RotateImage {
    @Test
    public void example(){
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotateTheImage(matrix);
    }

    private void rotateTheImage(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int index = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                matrix[index++][j - i] = matrix[i][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
