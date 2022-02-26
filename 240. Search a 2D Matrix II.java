class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix==null){
            return false;
        }

        int row =0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
               return true;
                
            }
           else if(matrix[row][col]>target){
                col--;
                
            }else if(matrix[row][col]<target){
                row++;
            }
        }
        return false;
    }
}
