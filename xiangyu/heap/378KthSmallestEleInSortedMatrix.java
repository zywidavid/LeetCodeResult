// Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
//
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//
// Example:
//
// matrix = [
//    [ 1,  5,  9],
//    [10, 11, 13],
//    [12, 13, 15]
// ],
// k = 8,
//
// return 13.
// Note:
// You may assume k is always valid, 1 ≤ k ≤ n2.




class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix.length < 1 || matrix[0].length < 1) {
            return -1;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        PriorityQueue<Cell> minHeap = new PriorityQueue<Cell> (k, new Comparator<Cell> () {
            @Override
            public int compare(Cell c1, Cell c2) {
                if (c1.value == c2.value) {
                    return 0;
                }
                return c1.value < c2.value ? -1 : 1;
            }
        });

        boolean[][] visited = new boolean[rows][cols];
        minHeap.offer(new Cell(0, 0, matrix[0][0]));
        visited[0][0] = true;

        for (int i = 0; i < k - 1; i++) {
            Cell cur = minHeap.poll();
            if (cur.row + 1 < rows && !visited[cur.row + 1][cur.col]) {
                minHeap.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
                visited[cur.row + 1][cur.col] = true;
            }
            if (cur.col + 1 < rows && !visited[cur.row][cur.col + 1]) {
                minHeap.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
                visited[cur.row][cur.col + 1] = true;
            }
        }
        return minHeap.peek().value;

    }

    static class Cell {
        int row;
        int col;
        int value;
        Cell (int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }
    }
}
