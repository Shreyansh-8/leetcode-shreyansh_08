/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum=0;
    public static void helper(TreeNode root){
        if(root==null) return ;
        helper(root.right);
        root.val=root.val+sum;
        sum=root.val;
        helper(root.left);
        return ;
    }
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return root;
        helper(root);
        sum=0;
        return root;

    }
}