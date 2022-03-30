class Solution {
    int count =0;
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    void helper(char[][] grid,int i,int j){
        if(i>grid.length-1||j>grid[0].length-1||i<0||j<0||grid[i][j]!='1') return;
        grid[i][j] ='0';
        helper(grid,i-1,j);
        helper(grid,i+1,j);
        helper(grid,i,j-1);
        helper(grid,i,j+1);
    }
}