// Given a binary tree, return the inorder traversal of its nodes' values.
//
// For example:
// Given binary tree [1,null,2,3],
//    1
//     \
//      2
//     /
//    3
// return [1,3,2].
//
// Note: Recursive solution is trivial, could you do it iteratively?

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            // always try go to the left to see if there is any node should
            // be traveersed before the cur node, cur node is stored on stack
            // since it hasn't been traveersed yet
            while (root != null) {
                stack.offerFirst(root);
                root = root.left;
            }
            // then traverse upper right node
            root = stack.pollFirst();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
