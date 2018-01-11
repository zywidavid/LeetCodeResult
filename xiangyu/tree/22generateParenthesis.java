// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
// For example, given n = 3, a solution set is:
//
// [
//   "((()))",
//   "(()())",
//   "(())()",
//   "()(())",
//   "()()()"
// ]
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[2 * n];
        parenthesis(arr, n, n, 0, res);
        return res;
    }
    // left, right to record how many '(' ')' still have
    private void parenthesis(char[] arr, int left, int right, int index, List<String> res) {
        // terminate condition
        if (left == 0 && right == 0) {
            res.add(new String(arr));
            return;
        }

        // add '('
        if (left > 0) {
            arr[index] = '(';
            parenthesis(arr, left - 1, right, index + 1, res);
        }
        // add ')'
        if (left < right) {
            arr[index] = ')';
            parenthesis(arr, left, right - 1, index + 1, res);
        }
    }
}
