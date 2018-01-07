public class Backtracking {
    public static List<List<Object>> backtrack(int[] A) {
        // Save all possible solutions
        List<List<Object>> result = new ArrayList<List<Object>>();
        if ( A == null || A.length == 0) return result;
        helper(A, 0, new ArrayList<Object>(), result);
        return result;
    }

    private static void helper(int[] A, int pos, List<Object> item, List<List<Object>> result) {
        if (isSolution(A, pos)) {
            collectSolution(result, solution);
            return;
        }

        for (int i = pos; i < A.length; i++) {
            //prune searching, stop searching along this path
            if (!isValid(A[i])) continue;
            // Before searching, record the latest element we are using
            makeMove(solution, A[i]);

            // Search all possible solutions based on ith element.
            // Warning: remember as we've already added ith element, the last parameter
            // must be `i + 1`.
            dfs(result, solution, A, i + 1);

            // After searching based on ith element, take back the move and search another
            // possible partial solution.
            unmakeMove(solution, A[i]);
        }
    }
}
