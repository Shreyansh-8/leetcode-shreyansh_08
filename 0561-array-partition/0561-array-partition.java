class Main {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i+=2){
            max=max+nums[i];
        }
        return max;
    }
}
