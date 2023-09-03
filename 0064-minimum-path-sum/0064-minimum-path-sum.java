class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(i==0 && j==0) dp[i][j]=grid[i][j];
                 else{
                     int up=grid[i][j];
                     
                    if(i>0){
                        up = up + dp[i-1][j]; 
                    }
                     else{
                         up=Integer.MAX_VALUE;
                     }
                     int left=grid[i][j];
                     if(j>0) {
                
                     left = left + dp[i][j-1];
                     }
                     else{
                         left=Integer.MAX_VALUE;
                     }
                     dp[i][j]=Math.min(up,left);
                 }
             } 
        }
        return dp[m-1][n-1];
    }
}