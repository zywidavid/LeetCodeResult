// Check if a given binary tree is completed. A complete binary tree is one in which every level of the binary tree is completely filled except possibly the last level. Furthermore, all nodes are as far left as possible.
//
// Examples
//
//         5
//
//       /    \
//
//     3        8
//
//   /   \
//
// 1      4
//
// is completed.
//
//         5
//
//       /    \
//
//     3        8
//
//   /   \        \
//
// 1      4        11
//
// is not completed.
/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public boolean isCompleted(TreeNode root) {
    if (root == null) {
      return true;
    }
    Queue<TreeNode> q = new LinkedList<>();
    // if falg true, there should not be any child nodes afterwards
    boolean flag = false;
    q.offer(root);
    while(!q.isEmpty()) {
      TreeNode cur = q.poll();
      // if any of the child is not present, set flag to true
      if (cur.left == null) {
        flag = true;
      } else if (flag) { //if flag is set but still see cur has a left node
        return false;
      } else {
        // if flag is not set and left child is present
        q.offer(cur.left);
      }
      //right side same as left
      if (cur.right == null) {
        flag = true;
      } else if (flag) {
        return false;
      } else {
        q.offer(cur.right);
      }
    }
    return true;
  }
}
