//Space Complexity O(m+n)

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] rowZero = new int[n];
         int[] ColZero = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(matrix[i][j]==0){
                    rowZero[i]=1;
                    ColZero[j] = 1;
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(rowZero[i]==1||ColZero[j]==1){
                    matrix[i][j]=0;
                    
                }
    }
}
        
    }}
