class Solution {
    public int numSquares(int n) {
        int temp=(int)Math.sqrt(n);
        if(temp*temp==n) return 1;
        int[] arr = new int[(int)Math.pow(10,4)+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=100;i++){
            arr[i*i]=1;
        }
        for(int i=2;i<=n;i++){
            int ans = Integer.MAX_VALUE;
            temp=(int)Math.sqrt(i);
            while(temp>0){
                ans = Math.min(ans,arr[i-(temp*temp)]+1);
                temp--;
            }
            arr[i]=ans;
        }
        return arr[n];
    }
}