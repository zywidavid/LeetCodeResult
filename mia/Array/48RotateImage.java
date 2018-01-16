/**
每一层的一个点的rotate, 四个相关 点的坐标 如下：
*   ------------
    |    1      |  1 (r, c)
    |         2 |  2 (c, N-1-r)
    | 4         |  4 (N-1-c, r)
    |      3    |  3 (N-1-r, N-1-c)
    -------------

    1 <- 4, 4 <- 3, 3 <- 2, 2 <- 1
    注意: row和col的range
*/
class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int N = matrix.length;
        for(int row = 0; row <N/2; row++){
            for(int col = row; col < N-row-1; col++){
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[N-1-col][row];
                matrix[N-1-col][row] = matrix[N-1-row][N-1-col];
                matrix[N-1-row][N-1-col] = matrix[col][N-1-row];
                matrix[col][N-1-row] = tmp;
            }
        }
    }
}
