class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean helper(TreeNode root, int min, int max) {
        if(root == null) return true;
        if(root.left != null && root.val == Integer.MIN_VALUE ||
          root.right!= null && root.val == Integer.MAX_VALUE) return false;
        return root.val >= min && root.val <= max
            && helper(root.left, min, root.val - 1)
            && helper(root.right, root.val + 1, max);
    }
}
