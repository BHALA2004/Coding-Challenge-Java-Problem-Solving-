class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    Marking(grid,i,j);
                }
            }
        }
        return count;
    }
    void Marking(char[][] grid,int i,int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || j<0){
            return;
        }
        if(i>=row || j>=col){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        Marking(grid,i-1,j);
        Marking(grid,i+1,j);
        Marking(grid,i,j+1);
        Marking(grid,i,j-1);
    }
}