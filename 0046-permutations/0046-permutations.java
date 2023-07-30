class Solution {
    public static void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void helper(int[] nums,int ind, List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(ds);
            return ;
        }
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            helper(nums,ind+1,ans);
            swap(ind,i,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
}