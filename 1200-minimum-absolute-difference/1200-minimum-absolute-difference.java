class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int d=Math.abs(arr[0]-arr[1]);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            List<Integer> diff=new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==d){
                diff.add(arr[i]);
                diff.add(arr[i+1]);
            }
            else if(Math.abs(arr[i]-arr[i+1])<d){
                d=Math.abs(arr[i]-arr[i+1]);
                ans.clear();
                i=0;
                continue;
            }
            if(!diff.isEmpty()){
                ans.add(diff);
            }
            
        }
        return ans;
    }
}