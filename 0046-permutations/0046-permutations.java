class Solution {
    public static void helper(int[] nums, boolean[] f, List<Integer> ds, List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<f.length;i++){
            if(!f[i]){
                f[i]=true;
                ds.add(nums[i]);
                helper(nums,f,ds,ans);
                ds.remove(ds.size()-1);
                f[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] f = new boolean[nums.length];
        helper(nums,f,new ArrayList<>(),ans);
        return ans;
    }
}