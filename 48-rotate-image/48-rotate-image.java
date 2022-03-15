class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //123 147
        //456 258
        //789 369
        
        for(int i=0;i<n;i++){
            int left =0;
            int right = matrix.length-1;
               while(left<right){
                   int temp = matrix[i][left];
                   matrix[i][left] = matrix[i][right];
                   matrix[i][right] = temp;
                   left++;right--;
                   
               }
        
    }
    }
}
