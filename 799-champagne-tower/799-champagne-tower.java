class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] ans = new double[100][100];
        ans[0][0] = (double)poured;
        for(int i=0;i<query_row;i++){
            for(int j=0;j<=i;j++){
                double c = (ans[i][j]-1.0)/2;
                if(c>0){
                     ans[i+1][j] +=c;
                 ans[i+1][j+1] +=c;
                    
                }
            }
        }
        return Math.min(1,ans[query_row][query_glass]);
    }
}