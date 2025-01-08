class Solution {
    public int helper(int[][] dp,int m,int n){
        if(m==0 || n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        else{
            return dp[m][n]=helper(dp,m-1,n)+helper(dp,m,n-1);
        }
    }
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j]=-1;
            }
        }
        return helper(arr,m-1,n-1);
    }
}