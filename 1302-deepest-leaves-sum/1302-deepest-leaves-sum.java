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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.offer(root);
        if(q.peek()==null) return 0;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                l.add(q.poll().val);
            }
            list.add(l); 
        }    
            int ans=0;
            int s = list.size()-1;
            for(int i=0;i<list.get(s).size();i++){
                ans = ans + list.get(s).get(i);
            }
        return ans;
    }        
}