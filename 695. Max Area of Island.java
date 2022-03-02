class Solution {
    int count =0;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                   max= Math.max(max,count);
                    count =0;
                }
            }
        }
        return max;
    }
    int dfs(int[][] grid,int i ,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!=1)
            return 0;
        
        grid[i][j]=0;       
             count++;
         dfs(grid,i,j+1);
             dfs(grid,i,j-1);
             dfs(grid,i+1,j);
             dfs(grid,i-1,j);
          return count;
        
    }
}
