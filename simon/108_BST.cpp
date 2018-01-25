/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
    TreeNode* createBST(const vector<int>& nums, int left, int right) {
        if (left > right) return NULL;
        int mid = left + (right - left) / 2;
        TreeNode* root = new TreeNode(nums[mid]); //std::unique_ptr<TreeNode> root = std::make_unique<TreeNode>();
        root->left = createBST(nums, left, mid - 1);
        root->right = createBST(nums, mid + 1, right);
        return root;
    }
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        int len = nums.size();
        if (len < 1) return NULL;
        return createBST(nums, 0, len - 1);
    }
};
