package Problems;

import org.junit.Test;

public class Searcha2DMatrix {
    @Test
    public void example(){
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 60;
        System.out.println(findTargetValue(matrix,target));
    }

    private boolean findTargetValue(int[][] matrix,int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]==target){
                    return true;
                }
            }

        }
        return false;
    }
}
