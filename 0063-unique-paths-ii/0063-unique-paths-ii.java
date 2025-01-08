class Solution {
    public int helper(int[][] grid, int m, int n, int[][] dp) {
        // Base Case: If the cell is out of bounds or has an obstacle
        if (m < 0 || n < 0 || grid[m][n] == 1) {
            return 0;
        }

        // Base Case: If we reach the top-left corner
        if (m == 0 && n == 0) {
            return 1;
        }

        // If the result for this cell is already computed, return it
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        // Calculate the result for this cell and store it in the DP array
        dp[m][n] = helper(grid, m - 1, n, dp) + helper(grid, m, n - 1, dp);
        return dp[m][n];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Edge Case: If the start or end cell is blocked
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        // Create a DP array initialized to -1
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        // Call the helper function to compute the result
        return helper(obstacleGrid, m - 1, n - 1, dp);
    }
}