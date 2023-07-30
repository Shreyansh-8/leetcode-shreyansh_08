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
    public static void traverse(TreeNode root, int level,List<Integer> list){
        if(root==null) return ;
        if(list.size()==level){
            list.add(root.val);
        }
        else{
            
            list.set(level,list.get(level)+root.val);
        }
        traverse(root.left,level+1,list);
        traverse(root.right,level+1,list);
    }
    public int deepestLeavesSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return root.val;
        traverse(root,0,list);
            int ans=0;
            int s = list.size()-1;
        return list.get(s);
    }        
}