class Solution {
    public static int count(int[][] grid , int[] val){
        int re = 0;
        int n = grid.length;
        for(int i = 0;i<n;i++){
            int[] x = new int[n];
            for(int j = 0;j<n;j++){
                x[j]=grid[j][i];
            }
            if(Arrays.equals(x,val)){
                re+=1;
            }
        }

        return re;
    }
    public int equalPairs(int[][] grid) {
        int count=0;
        for(int[] i : grid)
            count+=count(grid,i);
        return count;

    }
}