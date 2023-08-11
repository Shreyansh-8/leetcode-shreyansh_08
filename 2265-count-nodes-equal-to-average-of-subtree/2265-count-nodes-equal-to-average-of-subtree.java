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
    private static int a=0;
    public Pair<Integer,Integer> traverse(TreeNode root){
        if(root==null){
            Pair<Integer,Integer> temp = new Pair(0,0);
            return temp;
        }
        Pair<Integer,Integer> left = traverse(root.left);
        Pair<Integer,Integer> right = traverse(root.right);
        int sum= root.val + left.getKey() + right.getKey();
        int n = 1+ left.getValue() + right.getValue();
        if(n!=0 && root.val == (sum/n)){
            a++;
        }
        Pair<Integer,Integer> temp = new Pair(sum,n);
        return temp;
       
    } 
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        int ans =a;
        a=0;
        return ans;
    }
}