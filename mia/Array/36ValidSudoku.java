/**
* 检查 每一行 row, 检查每一列 col, 检查每一个unit (3*3的小九宫格)
  时间 O（N＊N）
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i ++){
            if(!isValidRow(board, i)) return false;
        }
        for(int j = 0; j < board[0].length; j ++){
            if(!isValidCol(board, j)) return false;
        }
        for(int i = 0; i < board.length; i += 3) {
            for(int j = 0; j < board[0].length; j += 3) {
                if(!isValidUnit(board, i, j)) return false;
            }
        }
        return true;
    }
    private boolean isValidRow(char[][] board, int row) {
        HashSet used = new HashSet<>();
        for(int i = 0; i < board[0].length; i++){
            char c = board[row][i];
            if(c == '.') continue;
            if(used.contains(c)) return false;
            used.add(c);
        }
        return true;
    }
    private boolean isValidCol(char[][] board, int col) {
        HashSet used = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            char c = board[i][col];
            if(c == '.') continue;
            if(used.contains(c)) return false;
            used.add(c);
        }
        return true;
    }
    private boolean isValidUnit(char[][] board, int row, int col) {
        HashSet used = new HashSet<>();
        for(int i = row; i < row + 3; i++){
           for(int j = col; j < col + 3; j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(used.contains(c)) return false;
                used.add(c);
           }
        }
        return true;
    }
}
