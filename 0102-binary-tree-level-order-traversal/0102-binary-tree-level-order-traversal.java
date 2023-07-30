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
    public static void traverse(TreeNode root, int level,List<List<Integer>> list){
        if(root==null) return ;
        if(list.size()==level){
            list.add(new ArrayList<>());
        }
            list.get(level).add(root.val);
        traverse(root.left,level+1,list);
        traverse(root.right,level+1,list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        traverse(root,0,list);
        return list;
    }
}