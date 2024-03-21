package Problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    @Test
    public void example(){
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZero(matrix);
    }

    private void setZero(int[][] matrix) {
        int zero = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==0){
                     list.add(j);
                }

            }
        }

        int temp1 = list.get(0);
        int temp2 = list.get(1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == temp1 || j==temp2 || j==temp1 || i == temp2){
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
