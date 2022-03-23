class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans =0;
        for(int i=0;i<n;i++){
            if(isConnected[i][i]==0) continue;
            ans++;
            dfs(isConnected,i);
        }
         return ans;
    }
   
    
    void dfs(int[][] isConnected,int i){
        //make value 1 to 0
        isConnected[i][i]=0;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1){
                // mark 1 as 0
                isConnected[i][j] =0;
                //if already visited check by using dfs function
            if(isConnected[j][j]==1){
                dfs(isConnected,j);
            }
            }
        }
    }
}