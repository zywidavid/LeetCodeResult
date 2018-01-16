class Solution {
    //1 (r,c) 2 (c, N-1-r), 3 (N-1-r, N-1-c) 4 (N-1-c, r)
    //4 -> 1, 3 -> 4, 2 -> 3, 1 -> 2
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
