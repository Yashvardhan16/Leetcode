class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
                int m = grid[0].length;
        int lo=0;
        int hi =m-1;
        int count=0;
        while(lo<n && hi>=0){
            if(grid[lo][hi]<0){
                count += n-lo;
            hi--;
            }else{
                lo++;
            }
            
        }
        return count;

    }
}
