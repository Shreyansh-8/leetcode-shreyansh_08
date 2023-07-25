class Solution {
   public void helper(List<List<Integer>> ds,List<Integer> comb, int[] candidates, int target, int i){
       if(target==0){
           ds.add(new ArrayList<>(comb));
           return ;
       }
       
       for(int j=i;j<candidates.length;j++){
           if(j>i && candidates[j]==candidates[j-1]) continue;
           if(candidates[j]>target) break;
           
           target = target - candidates[j];
           comb.add(candidates[j]);
           helper(ds,comb,candidates,target,j+1);
           target = target + candidates[j];
           comb.remove(comb.size()-1);
       }
    
 }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ds = new ArrayList<>();
        Arrays.sort(candidates);
        int i=0;
        helper(ds,new ArrayList<>(),candidates,target,i);
        return  ds;
       
    }
}