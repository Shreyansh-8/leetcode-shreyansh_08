class Solution {
   public void helper(List<List<Integer>> ds,List<Integer> comb, int[] candidates, int target, int i){
        if(i==candidates.length){
            if(target==0){
                
            ds.add(new ArrayList<>(comb));
            }
            return;
        }
       if(candidates[i]<=target){
           target=target-candidates[i];
           comb.add(candidates[i]);
           helper(ds,comb,candidates,target,i);
           target=target+candidates[i];
       comb.remove(comb.size()-1);    
          }
       helper(ds,comb,candidates,target,i+1);
       return;
    
 }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ds = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();    
        int i=0;
        helper(ds,new ArrayList<>(),candidates,target,i);
        return ds;
    }
}