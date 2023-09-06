class Solution {
    public int[] countBits(int n) {
        if(n==0){
            return new int[]{0};
        }
        int[] ans = new int[n+1];
        ans[0]=0;
        ans[1]=1;
        int i=2;
        while(i<n+1){
            int ind=0;
            for(int j=i;j<i*2 && j<n+1;j++){
                ans[j]=ans[ind]+1;
                ind++;
            }
            i=i*2;
        }
        return ans;
    }
}