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
    private Map<Integer, List<TreeNode>> m = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) { 
        if(n%2==0) return new ArrayList<TreeNode>();
        if(n==1) return Arrays.asList(new TreeNode());
        if(m.containsKey(n)) return m.get(n);
        List<TreeNode> res = new ArrayList<>();
        for(int i=1;i<n;i+=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n-1-i);
            
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode root = new TreeNode(0,l,r);
                    res.add(root);
                }
            }
        }
        m.put(n,res);
        return res;
        
        
    }
}