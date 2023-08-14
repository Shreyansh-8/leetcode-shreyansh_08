class Solution {
    public static void helper(String[] arr,int ind, int target,int[] array){
        if(ind==arr.length){
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("1")){
                target = target + Math.abs(ind-i);
            }
        }
        array[ind]=target;
        target = 0;
        helper(arr,ind+1,target,array);
    }
    public int[] minOperations(String boxes) {
        String[] arr  = boxes.split("");
        int[] array = new int[arr.length];
        int target = 0;
        helper(arr,0,target,array);
        
        return array;
        
    }
}