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
    private static int sum=0;
    public static void child(TreeNode root){
        if(root==null) return ;
        sum=sum+root.val;
    }
    public static void parent(TreeNode root){
        if(root==null) return ;
        if(root.val%2==0){
            if(root.right!=null){
                
            child(root.right.right);
            child(root.right.left);
            }
            if(root.left!=null){
            child(root.left.right);
            child(root.left.left); 
            }
        }
        parent(root.right);
        parent(root.left);
        return ;
    }
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null) return sum;
        parent(root);
        int s = sum;
        sum=0;
        return s;
    }
}