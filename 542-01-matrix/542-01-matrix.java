class Solution {
    public int[][] updateMatrix(int[][] matrix) {
          int n = matrix.length;
        int m = matrix[0].length;
        int max = 1000000;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                    int top = i-1 >=0 ? matrix[i-1][j]:max;
                    int left = j-1 >=0 ? matrix[i][j-1]:max;
                    matrix[i][j] = Math.min(top,left)+1;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(matrix[i][j]!=0){
                    int bottom = i+1 <n ? matrix[i+1][j]:max;
                    int right = j+1 <m ? matrix[i][j+1]:max;
                    matrix[i][j] = Math.min(matrix[i][j],Math.min(right,bottom)+1);
                }
            }
        }
        return matrix;
    }
}
   